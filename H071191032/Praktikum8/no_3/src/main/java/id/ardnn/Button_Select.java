package id.ardnn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Button_Select {
    private App obj_app = new App();

    static FileChooser file_chooser;
    static File selected_file;

    public static void action(Stage stage, TextArea txt_area) {
        file_chooser = new FileChooser();
        file_chooser.getExtensionFilters().add(
            new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );
        selected_file = file_chooser.showOpenDialog(stage);

        String text = readFile(selected_file);
        writeFile(text, txt_area);
    }

    private static String readFile(File file) {
        FileReader fl_input = null;
        BufferedReader buff_input = null;

        String text = "";
        try {
            fl_input = new FileReader(file);
            buff_input = new BufferedReader(fl_input);

            String reader;
            while ((reader = buff_input.readLine()) != null) {
                text += reader + "\n";
            }
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                if (buff_input != null) buff_input.close();
                if (fl_input != null) fl_input .close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return text;
    } 

    private static void writeFile(String text, TextArea output) {
        output.setText(text);
    }

    
}