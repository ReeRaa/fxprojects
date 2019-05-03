package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    public static void display(String title,String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); //block input from other windows
        window.setTitle(title);
        window.setMinWidth(250);

        Label label1=new Label();
        label1.setText(message);

        Button closebutton=new Button("Close the window!");
        closebutton.setOnAction(e-> window.close());

        VBox layout=new VBox(20);
        layout.getChildren().addAll(label1,closebutton);
        layout.setAlignment(Pos.CENTER);

        Scene scene=new Scene(layout);
        window.setScene(scene);

        window.showAndWait();

    }
}
