package id.ardnn;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    private RightLayout right_layout = new RightLayout();
    private LeftLayout left_layout = new LeftLayout();

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        window.setTitle("Group Program");

        

        SplitPane split_layout = new SplitPane(left_layout.layout(), right_layout.layout());
        Scene scene = new Scene(split_layout, 750, 400);
        window.setScene(scene);
        window.show();
    }

    
}