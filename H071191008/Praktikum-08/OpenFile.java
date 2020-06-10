package eka.prak;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class OpenFile implements EventHandler<ActionEvent> {

    private Button button;
    private Stage stage;
    private TextArea textArea;

    public OpenFile(Button button, TextArea textArea, Stage stage) {
        this.button = button;
        this.stage = stage;
        this.textArea = textArea;
    }
    
    @Override
    public void handle(ActionEvent event) {
        button.setDisable(true);
        textArea.setText("");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select UTF-8 Text File");
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("TXT Files", "*.txt"),
            new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        File file = fileChooser.showOpenDialog(stage);

        if (file == null) {
            button.setDisable(false);
            return;
        }

        try {
            textArea.setText(Number3.readFile(file));
        }
        catch (IOException ioe) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error to read file");
            alert.setContentText(ioe.getMessage());
        }
        catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Unknown error");
            alert.setContentText(e.getMessage());
        }
        button.setDisable(false);
    }
}
