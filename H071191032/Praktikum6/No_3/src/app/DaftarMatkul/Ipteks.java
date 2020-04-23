package app.DaftarMatkul;

import app.Matkul;

public class Ipteks extends Matkul{

    @Override
    public String getNama() {
        return "Wawasan Ipteks";
    }

    @Override
    public String getDosen() {
        return "Dr. Sri Suryani, DEA";
    }

    @Override
    public int getSks() {
        return 2;
    }

}