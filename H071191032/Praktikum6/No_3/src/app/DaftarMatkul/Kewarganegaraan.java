package app.DaftarMatkul;

import app.Matkul;

public class Kewarganegaraan extends Matkul{

    @Override
    public String getNama() {
        return "Kewarganegaraan";
    }

    @Override
    public String getDosen() {
        return "Pak Irham";
    }

    @Override
    public int getSks() {
        return 2;
    }

}