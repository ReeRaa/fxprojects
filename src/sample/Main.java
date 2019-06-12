package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {
    Button button;
    Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello World");

        button =new Button();
        button.setText("Pizza");

        button2 =new Button();
        button2.setText("Tomato");

        button.setOnAction(this);

        StackPane layout=new StackPane();
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button,button2);

        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        if( event.getSource()== button) {
            System.out.println("Pizza!!!");
        }
        if( event.getSource()== button2){
            System.out.println("Tomato!!!");
        }
    }
}
