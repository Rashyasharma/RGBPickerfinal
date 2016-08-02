package application;
	

import javafx.scene.paint.Color;
import java.sql.PseudoColumnUsage;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		float r,g,b;
		try {
			VBox root = new VBox();
			root.setAlignment(Pos.TOP_CENTER);
			root.setSpacing(20);
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Text header = new Text("RGB Picker");
			header.setFont(new Font("Arial", 80));
			
			Label redval = new Label("0");
			Label redvalue =new Label("RED");
			redval.setTextFill(Color.web("#cc0033"));
			Label greenval = new Label("0");
			Label greenvalue =new Label("GREEN");
			greenval.setTextFill(Color.web("#1f9b23"));
			Label blueval = new Label("0");
			Label bluevalue =new Label("BLUE");
			blueval.setTextFill(Color.web("#1099dd"));
			
			
			
			
			Button btn = new Button();
			btn.setScaleX(3);
			btn.setScaleY(2);
			
			
				
			
			 Slider sliderred = new Slider(0, 255, 0.5);
			 sliderred.setShowTickMarks(true);
			 sliderred.setShowTickLabels(true);
			 sliderred.setMajorTickUnit(5f);
			 sliderred.setBlockIncrement(1f);
			 sliderred.setPadding(new Insets(10, 10, 10, 10));
			 sliderred.valueProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					
					
					redval.setText(Integer.toString(newValue.intValue()));
					btn.setStyle("-fx-base: rgb("+ redval.getText()  +   "," + greenval.getText()  + ","+ blueval.getText() + ");");
					
				}
				 
				 
			});
			 
			 Slider slidergreen = new Slider(0, 255, 0.5);
			 slidergreen.setShowTickMarks(true);
			 slidergreen.setShowTickLabels(true);
			 slidergreen.setMajorTickUnit(5f);
			 slidergreen.setBlockIncrement(1f);
			 slidergreen.setPadding(new Insets(10, 10, 10, 10));
			 slidergreen.valueProperty().addListener(new ChangeListener<Number>() {

					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
						
						
						greenval.setText(Integer.toString(newValue.intValue()));
						btn.setStyle("-fx-base: rgb("+ redval.getText()  +   "," + greenval.getText()  + ","+ blueval.getText() + ");");
						
					}
					 
					 
				});
			 
			 Slider sliderblue = new Slider(0, 255, 0.5);
			 sliderblue.setShowTickMarks(true);
			 sliderblue.setShowTickLabels(true);
			 sliderblue.setMajorTickUnit(5f);
			 sliderblue.setBlockIncrement(1f);
			 sliderblue.setPadding(new Insets(10, 10, 10, 10));
			 sliderblue.valueProperty().addListener(new ChangeListener<Number>() {

					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
						
					
						blueval.setText(Integer.toString(newValue.intValue()));
						btn.setStyle("-fx-base: rgb("+ redval.getText()  +   "," + greenval.getText()  + ","+ blueval.getText() + ");");
						
					}
					 
					 
				});
			 
			 
			
			
			 VBox subLabel1 = new VBox();
			 subLabel1.setAlignment(Pos.CENTER);
			 subLabel1.setSpacing(10);
			 subLabel1.getChildren().add(redvalue);
			 subLabel1.getChildren().add(redval);
			 
			 
			 VBox subLabel2 = new VBox();
			 subLabel2.setSpacing(10);
			 subLabel2.setAlignment(Pos.CENTER);
			 subLabel2.getChildren().add(greenvalue);
			 subLabel2.getChildren().add(greenval);
			 
			 
			 VBox subLabel3 = new VBox();
			 subLabel3.setSpacing(10);
			 subLabel3.setAlignment(Pos.CENTER);
			 subLabel3.getChildren().add(bluevalue);
			 subLabel3.getChildren().add(blueval);
			
			 
			 
			root.getChildren().add(header);
			root.getChildren().add(sliderred);
			root.getChildren().add(slidergreen);
			root.getChildren().add(sliderblue);
			root.getChildren().add(subLabel1);
			root.getChildren().add(subLabel2);
			root.getChildren().add(subLabel3);
			root.getChildren().add(btn);
			primaryStage.setScene(scene);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
