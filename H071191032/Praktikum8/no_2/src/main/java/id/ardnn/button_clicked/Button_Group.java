package id.ardnn.button_clicked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import id.ardnn.AlertBox;
import id.ardnn.Kelompok;
import id.ardnn.LeftLayout;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Button_Group {
    
    private List<List<Text>> ls_data_kelompok = new ArrayList<>();


    private void setDataKelompok(Kelompok kelompok) throws IOException{
        FileReader database = null;
        BufferedReader buffer_reader = null;

        try {
            database = new FileReader(kelompok.getFile());
            buffer_reader = new BufferedReader(database);

            String reader, temp = "";
            while ((reader = buffer_reader.readLine()) != null)
                temp += reader + "\n";
            
            String[] dataKelompok = temp.split("\n");
            for (int i = 0; i < dataKelompok.length; i++) {
                ls_data_kelompok.add(new ArrayList<>());

                String[] data = dataKelompok[i].split(";");
                for (int j = 0; j < data.length; j++) {
                    ls_data_kelompok.get(i).add(new Text(data[j]));
                }
            }

        } catch (IOException e) {
            AlertBox.display("Database group not found");
        } finally {
            if (buffer_reader != null) buffer_reader.close();
            if (database != null) database.close();
        }
    }

    
    public void action(String namaKelompok) {
        Stage window = new Stage();
        window.setMinWidth(350);
        window.setTitle(namaKelompok);
        window.initModality(Modality.APPLICATION_MODAL);

        Kelompok[] arrKelompok = new LeftLayout().getArrKelompok();

        //get what kelompok from the button that has been clicked
        Kelompok kelompok = null;
        for (int i = 0; i < arrKelompok.length; i++) {
            if (arrKelompok[i].getNama().equals(namaKelompok)) {
                kelompok = arrKelompok[i];
                break;
            }
        }

        //add data from database kelompok to the ls_data_kelompok
        try {
            setDataKelompok(kelompok);
        } catch (IOException e) {
            AlertBox.display("Database not found");
        }

        //initialize text and set text to it
        Text txt_group = new Text(kelompok.getNama());
        Text txt_no = new Text("NO");
        Text txt_name = new Text("Name");
        Text txt_nim = new Text("NIM");
        Text txt_gender = new Text("Gender");

        //initialize separator
        Separator sep1 = new Separator(Orientation.HORIZONTAL);
        Separator sep2 = new Separator(Orientation.HORIZONTAL);   


        //initialize gridpane
        GridPane gridDataKelompok = new GridPane();
        gridDataKelompok.setPadding(new Insets(10, 20, 10, 20));
        gridDataKelompok.setVgap(12);
        gridDataKelompok.setHgap(32);
        gridDataKelompok.setAlignment(Pos.CENTER);

        //add txt header to the grid
        gridDataKelompok.add(txt_no, 0, 0);
        gridDataKelompok.add(txt_name, 1, 0);
        gridDataKelompok.add(txt_nim, 2, 0);
        gridDataKelompok.add(txt_gender, 3, 0);

        //add all data in ls_data_kelompok to the grid
        for (int i = 0; i < ls_data_kelompok.size(); i++) {
            gridDataKelompok.add(new Text(i+1 + ""), 0, i+1);
            for (int j = 0; j < ls_data_kelompok.get(i).size(); j++) {
                gridDataKelompok.add(ls_data_kelompok.get(i).get(j), j+1, i+1);
            }
        }

        //initialize btn_back
        Button btn_back = new Button(" Close ");

        //action if btn_back clicked
        btn_back.setOnAction(e -> {
            ls_data_kelompok.clear();
            window.close();
        });


        //initialize vbox layout and add all elements above to the vbox
        VBox vbox_layout = new VBox(15);
        vbox_layout.setPadding(new Insets(10, 10, 10, 10));
        vbox_layout.setAlignment(Pos.CENTER);
        vbox_layout.getChildren().addAll(
            txt_group,
            sep1,
            gridDataKelompok,
            sep2,
            btn_back
        );

        //create scene
        Scene scene = new Scene(vbox_layout);
        window.setScene(scene);
        window.showAndWait();
    }
}