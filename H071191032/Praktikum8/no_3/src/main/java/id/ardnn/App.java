package id.ardnn;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
    
        //creating button select first file
        Button btn_select = new Button("Select First File");
        btn_select.setPadding(new Insets(5, 20, 5, 20));

        //creating text area to showing the text from the selected file
        TextArea txt_area = new TextArea();
        txt_area.setMinHeight(300);

        //action if butotn select clicked
        btn_select.setOnAction(e -> {
            Button_Select.action(window, txt_area);
        });

        //creating vbox layout
        VBox vbox_layout = new VBox(15);
        vbox_layout.getChildren().addAll(btn_select, txt_area);
        vbox_layout.setPadding(new Insets(15, 15, 15, 15));
        vbox_layout.setAlignment(Pos.CENTER);

        //creating scene
        Scene scene = new Scene(vbox_layout, 350, 400);
        window.setScene(scene);
        window.show();
        
    }



}