public class Dosen extends Pegawai{
    int plus = 120000;

    @Override
    public void bonus(String name, int value) {
        int total = (value*plus) + gaji;
        System.out.println(name + " mendapatkan gaji Rp. " + total);
    }
}