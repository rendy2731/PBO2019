package id.ardnn.button_clicked;

import id.ardnn.AlertBox;
import id.ardnn.button_clicked.button_clicked.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Button_Add {
    private Button_Yes obj_buttonYes = new Button_Yes();
    private Button_No obj_buttonNo = new Button_No();

    private List<List<Text>> ls_text = new ArrayList<>();   
    private String[] str_text = {"Nama", "NIM", "Gender", "Group"};
    private Separator sep_top, sep_bot;

    private Stage window;
    private GridPane grid_data;
    private Button btn_yes, btn_no;

    public void action(String name, String nim, String gender, String group) {
        //creating stage
        window = new Stage();
        window.setMinWidth(350);
        window.setTitle("Confirm your data");
        window.initModality(Modality.APPLICATION_MODAL);

        //set ls_text
        String[] tempData = {name, nim, gender, group};
        for (int i = 0; i < str_text.length; i++) {
            ls_text.add(new ArrayList<>());
            ls_text.get(i).add(new Text(str_text[i]));
            ls_text.get(i).add(new Text(":  " + tempData[i]));
        }

        //creating gridpane for all data in ls_text
        grid_data = new GridPane();
        grid_data.setPadding(new Insets(20, 20, 20, 20));
        grid_data.setVgap(10);
        grid_data.setHgap(25);
        grid_data.setAlignment(Pos.CENTER);

        //place all text in ls_text to grid
        for (int i = 0; i < ls_text.size(); i++) {
            for (int j = 0; j < ls_text.get(i).size(); j++) {
                grid_data.add(ls_text.get(i).get(j), j, i);
            }
        }

        //creating button yes and no
        btn_yes = new Button(" YES ");
        btn_no = new Button(" NO ");

        //action if button yes clicked
        btn_yes.setOnAction(e -> {
            try {
                obj_buttonYes.action(tempData, window);
                AlertBox.display(name + " has been added to the " + group);
                ls_text.clear();
            } catch (IOException e1) {
                AlertBox.display(e1.getMessage());
            }
        });

        //action if button no clicked
        btn_no.setOnAction(e -> obj_buttonNo.action(window, ls_text));

        //creating hbox for button
        HBox hbox_button = new HBox(20, btn_yes, btn_no);
        hbox_button.setAlignment(Pos.CENTER);

        //creating separator
        sep_bot = new Separator(Orientation.HORIZONTAL);
        sep_top = new Separator(Orientation.HORIZONTAL);

        //creating vbox for the layout
        VBox vbox_layout = new VBox(15);
        vbox_layout.setPadding(new Insets(15, 15, 15, 15));
        vbox_layout.setAlignment(Pos.CENTER);
        vbox_layout.getChildren().addAll(
            new Text("Member's Data"), 
            sep_top, 
            grid_data, 
            sep_bot,
            new Text("Are you sure want to add this to the group?"),
            hbox_button
        );
        
        //creating a scene object and set it to the stage
        Scene scene = new Scene(vbox_layout);
        window.setScene(scene);
        window.showAndWait();
    }


}