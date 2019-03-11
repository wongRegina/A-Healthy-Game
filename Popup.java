package com.company;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Popup {
	boolean a = true;
	
	public boolean display() {
		Stage popupwindow = new Stage();

		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("Is it healthy?");
		
		Button button1 = new Button("This is healthy");
		button1.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent e) 
			{
				popupwindow.close();
				a = true;
			}
		});
		
		Button button2 = new Button("This is unhealthy");
		button2.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent e) 
			{
				popupwindow.close();
				a = false;
			}
		});	

		VBox layout = new VBox(10);
		layout.getChildren().addAll(button1, button2);
		layout.setAlignment(Pos.CENTER);
		Scene scene1 = new Scene(layout, 300, 250);
		popupwindow.setScene(scene1);
		popupwindow.showAndWait();
		return a;

	}

	public void display(boolean x, String message)
	{
		Stage popupwindow = new Stage();

		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("Results");
		
		String temp = "";
		if(x == true)
		{
			temp = "You are correct";
		}
		else
		{
			temp = "You are incorrect";
		}
		Label label1 = new Label(temp + "\n" + message);	

		Button button1 = new Button("click here to close the pop up");
		button1.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent e) 
			{
				popupwindow.close();
			}
		});
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label1, button1);
		layout.setAlignment(Pos.CENTER);
		Scene scene1 = new Scene(layout, 900, 250);
		popupwindow.setScene(scene1);
		popupwindow.showAndWait();
	}
}
