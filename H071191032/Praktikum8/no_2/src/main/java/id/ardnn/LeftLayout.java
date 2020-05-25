package id.ardnn;

import id.ardnn.button_clicked.Button_Group;
import id.ardnn.button_clicked.Button_Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * LeftLayout
 */
public class LeftLayout {
    

    private String[][] dataKelompok = { 
            { "src/main/java/id/ardnn/data_kelompok/kelompok1.txt", "Group 1" },
            { "src/main/java/id/ardnn/data_kelompok/kelompok2.txt", "Group 2" },
            { "src/main/java/id/ardnn/data_kelompok/kelompok3.txt", "Group 3" },
            { "src/main/java/id/ardnn/data_kelompok/kelompok4.txt", "Group 4" }
    };

    private Kelompok[] kelompok = {
            new Kelompok(dataKelompok[0][0], dataKelompok[0][1]),
            new Kelompok(dataKelompok[1][0], dataKelompok[1][1]), 
            new Kelompok(dataKelompok[2][0], dataKelompok[2][1]),
            new Kelompok(dataKelompok[3][0], dataKelompok[3][1])
    };

    private GridPane gridKelompok = new GridPane();
    private VBox boxLayout = new VBox(12);

    public VBox layout() {
        Button_Group obj_btn_group = new Button_Group();
        App obj_app = new App();

        Text txt_kelompok = new Text("Group");

        // creating arrButton from array Kelompok
        Button[] arrButton = new Button[kelompok.length];
        for (int i = 0; i < arrButton.length; i++) {
            arrButton[i] = new Button(kelompok[i].getNama());
            arrButton[i].setPadding(new Insets(5, 20, 5, 20));
        }

        // if button group clicked
        for (int i = 0; i < arrButton.length; i++) {
            int index = i;
            arrButton[index].setOnAction(e -> {
                obj_btn_group.action(arrButton[index].getText());

            });   
        }

        // setting the gridpane
        gridKelompok.setPadding(new Insets(15, 15, 15, 15));
        gridKelompok.setVgap(15);
        gridKelompok.setHgap(50);
        gridKelompok.setAlignment(Pos.CENTER);

        // put all button in arrButton to the grid
        for (int i = 0, row = 0; i < arrButton.length; i++) {
            if (i % 2 == 0 && i != 0)
                row++;
            if (i % 2 == 0)
                gridKelompok.add(arrButton[i], 0, row);
            else
                gridKelompok.add(arrButton[i], 1, row);
        }

        // setting the vbox layout
        boxLayout.getChildren().addAll(txt_kelompok, gridKelompok);
        boxLayout.setPadding(new Insets(20, 20, 20, 20));
        boxLayout.setAlignment(Pos.CENTER);

        return boxLayout;
    }

    public Kelompok[] getArrKelompok() {
        return kelompok;
    }    
}