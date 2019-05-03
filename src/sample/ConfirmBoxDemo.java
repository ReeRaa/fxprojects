package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ConfirmBoxDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage stage= primaryStage;
        stage.setTitle("AlertBox demo");

        Button button=new Button("Click me!");
        button.setOnAction(e-> {
            boolean result = ConfirmBox.display("Title of window","Are you sure you want to send pics???");
            System.out.println(result);
        });

        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        Scene scene=new Scene(layout,300,300);
        stage.setScene(scene);
        stage.show();

    }
}
