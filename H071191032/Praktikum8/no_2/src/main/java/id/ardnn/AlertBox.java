package id.ardnn;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    
    public static void display(String message) {
        Stage window = new Stage();
        window.setTitle("Alert !!!");
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(350);

        Button button_ok = new Button("OK");
        button_ok.setOnAction(e -> window.close());

        VBox vbox_layout = new VBox(15, new Text(message), button_ok);
        vbox_layout.setPadding(new Insets(30, 30, 30, 30));
        vbox_layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox_layout);
        window.setScene(scene);
        window.showAndWait();
    }
}