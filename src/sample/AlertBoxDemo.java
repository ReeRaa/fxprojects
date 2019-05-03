package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AlertBoxDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage stage= primaryStage;
        stage.setTitle("AlertBox demo");

        Button button=new Button("Click me!");
        button.setOnAction(e-> AlertBox.display("New window title","This is alert!"));

        StackPane layout=new StackPane();
        layout.getChildren().addAll(button);
        Scene scene=new Scene(layout,200,300);
        stage.setScene(scene);
        stage.show();

    }
}
