package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AnonymousInnerClassAndLambda extends Application {

    Button button;
    //Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello World");

        button =new Button();
        button.setText("Pizza");

        //button2 =new Button();
        //button2.setText("T");

        button.setOnAction(e -> System.out.println("Hey redhead!"));

        StackPane layout=new StackPane();
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button);

        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
