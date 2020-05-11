package id.ardnn;

import java.io.File;

import javafx.scene.control.Label;

public class Kelompok {
    private File database;
    private String nama_kelompok;

    public Kelompok(String database, String namaKelompok) {
        this.database = new File(database);
        this.nama_kelompok = namaKelompok;
    }

    public File getFile() {
        return this.database;
    }

    public String getNama() {
        return this.nama_kelompok;
    }

}

