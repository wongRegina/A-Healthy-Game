package com.company;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Board {
	private final int SIZE = 200;
	private final int NUM_OF_ROW = 4;
	private final int NUM_OF_COL = 4;
	private final int NUM_OF_BUTTONS = 16;
	private GridPane buttons = new GridPane();
	private VBox scene = new VBox();
	private Foods temp = new Foods();
	private ArrayList<Food> tempList = temp.getFoods();
	private Popup popup = new Popup();
	public Board() 
	{
		temp.makeFood();
		temp.makeArray();
		buttons.setPrefSize(450,450);
		for (int r = 0; r < NUM_OF_ROW; r++) 
		{
			for (int c = 0; c < NUM_OF_COL; c++) 
			{
				Food x = (tempList.get(r + 4*c));
				final Button button = new Button(x.getName());
				button.setPrefWidth(SIZE);
				button.setPrefHeight(SIZE);
				button.setOnAction(new EventHandler<ActionEvent>() 
				{
					public void handle(ActionEvent e) 
					{
						if(x.isHealthy() == popup.display())
						{
							 popup.display(true, x.getCorrectMessage());
						}
						else
						{
							popup.display(false, x.getWrongMessage());
						}
						button.setVisible(false);
					}
				});
				buttons.add(button, r, c);
			}
		}
		buttons.setAlignment(Pos.CENTER);
		buttons.setPrefSize(450,450);
		
		final Button healthyButton = new Button("Healthy");
		healthyButton.setPrefWidth(SIZE - 50);
		healthyButton.setPrefHeight(SIZE -50);
		healthyButton.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent e) 
			{
				
			}
		});
		
		final Button unhealthyButton = new Button("Unhealthy");
		unhealthyButton.setPrefWidth(SIZE - 50);
		unhealthyButton.setPrefHeight(SIZE - 50);
		unhealthyButton.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent e) 
			{
				
			}
		});
		scene.getChildren().add(buttons);
	}
	
	public VBox getBoard()
	{
		return scene;
	}

}