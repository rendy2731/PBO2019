class Pegawai {
    String name;
    int gaji = 2500000;

    public Pegawai(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("\n" + this.name + " mendapatkan gaji Rp. " + this.gaji);
    }
}

class Dosen extends Pegawai {
    int sks;

    public Dosen(String name, int sks) {
        super(name);
        this.sks = sks;
    }

    public int getGaji() {
        return gaji + (this.sks * 120000);
    }

    public void showInfo() {
        System.out.println("\n" + this.name + " mendapatkan gaji Rp. " + this.getGaji()); 
    }
}

class Staff extends Pegawai {
    int kehadiran;

    public Staff(String name, int kehadiran) {
        super(name);
        this.kehadiran = kehadiran;
    }

    public int getGaji() {
        return gaji + (this.kehadiran * 50000);
    }

    public void showInfo() {
        System.out.println("\n" + this.name + " mendapatkan gaji Rp. " + this.getGaji()); 
    }
}