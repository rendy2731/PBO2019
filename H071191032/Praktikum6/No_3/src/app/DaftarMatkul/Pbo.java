package app.DaftarMatkul;

import app.Matkul;

public class Pbo extends Matkul{

    @Override
    public String getNama() {
        return "Pemrograman Berorientasi Objek";
    }

    @Override
    public String getDosen() {
        return "Supri Amir, ST. MS.i";
    }

    @Override
    public int getSks() {
        return 3;
    }
}