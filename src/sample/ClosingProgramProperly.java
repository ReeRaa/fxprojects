package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClosingProgramProperly extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }
//
    @Override
    public void start(Stage primaryStage) {
        window =primaryStage;
        window.setTitle("Close program properly");

        window.setOnCloseRequest(e->{
            e.consume();
            closeProgam();
        });

        button=new Button("Close program");
        button.setOnAction( e-> closeProgam());

        StackPane layout=new StackPane();
        layout.getChildren().addAll(button);

        Scene scene=new Scene(layout,300,300);
        window.setScene(scene);
        window.show();

    }

    private void closeProgam(){
        //System.out.println("File is saved!");
        //window.close();

        Boolean answer=ConfirmBox.display("Title","Are you sure, you want to exit?");
        if (answer) window.close();
    }
}
