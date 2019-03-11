package com.company;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 
 * @author Regina Wong
 *
 */
public class Main extends Application {
	private VBox scene = new VBox();
	private Board board = new Board();
	private HBox topPane = new HBox();
	private Button newGameButton = new Button("New Game");
	
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		newGameButton.setOnAction(e -> {
            Main newGame = new Main();
            newGame.start(primaryStage);
        });
				
		topPane.getChildren().add(newGameButton);
		scene.getChildren().add(topPane);
		scene.getChildren().add(board.getBoard());
		scene.setAlignment(Pos.CENTER);
		Scene wholeScene = new Scene(scene, 800, 800);
		
		primaryStage.setTitle("Health Game");
        primaryStage.setScene(wholeScene);
        primaryStage.show();
	}
}
