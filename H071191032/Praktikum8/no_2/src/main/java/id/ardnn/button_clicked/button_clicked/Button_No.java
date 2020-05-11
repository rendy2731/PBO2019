package id.ardnn.button_clicked.button_clicked;

import java.util.List;

import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Button_No {
    public void action(Stage window, List<List<Text>> text) {
        text.clear();
        window.close();
    }
}