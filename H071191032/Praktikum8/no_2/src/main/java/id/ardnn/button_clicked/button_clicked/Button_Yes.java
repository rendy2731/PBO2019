package id.ardnn.button_clicked.button_clicked;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import id.ardnn.AlertBox;
import id.ardnn.Kelompok;
import id.ardnn.LeftLayout;
import javafx.stage.Stage;

public class Button_Yes {
    private Kelompok[] arrKelompok = new LeftLayout().getArrKelompok();
    
    public void action(String[] data_member, Stage window) throws IOException {

        Kelompok kelompok = null;
        for (int i = 0; i < arrKelompok.length; i++) {
            if (data_member[3].equals(arrKelompok[i].getNama())) {
                kelompok = arrKelompok[i];
                break;
            }
        }

        FileWriter database_kelompok = null;
        BufferedWriter buffer_writer = null;

        try {
            database_kelompok = new FileWriter(kelompok.getFile(), true);
            buffer_writer = new BufferedWriter(database_kelompok);

            buffer_writer.write(data_member[0] + ";" + data_member[1] + ";" + data_member[2]);
            buffer_writer.newLine();
            buffer_writer.flush();
        } catch (IOException e) {
            AlertBox.display(e.getMessage());
        } finally {
            buffer_writer.close();
            database_kelompok.close();
        }

        window.close();
    }   
}