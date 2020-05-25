import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        

        System.out.print("Pilih bangun yang ingin dihitung :\n1. BANGUN RUANG\n2. BANGUN DATAR\n => ");
        int bangunPilihan = sc.nextInt();
        pilihanBangun(bangunPilihan);

    }

    static void pilihanBangun(int bangunPilihan) {
        switch(bangunPilihan) {
            case 1 :
                System.out.println("===== BANGUN RUANG =====");
                System.out.println("1. KUBUS");
                System.out.println("2. BALOK");
                System.out.println("3. PRISMA SEGITIGA");
                System.out.println("4. BOLA");
                System.out.println("5. TABUNG\n");

                System.out.print("Pilih bangun ruang :\n => ");
                int pilihan1 = sc.nextInt();
                bangunRuang(pilihan1);
                break;
            case 2 :
                System.out.println("===== BANGUN DATAR =====");
                System.out.println("1. PERSEGI");
                System.out.println("2. PERSEGI PANJANG");
                System.out.println("3. LINGKARAN");
                System.out.println("4. SEGITIGA");
                System.out.println("5. TRAPESIUM\n");

                System.out.print("Pilih bangun datar :\n => ");
                int pilihan2 = sc.nextInt();
                bangunDatar(pilihan2);
                break;
            default :
                break;
        }
    }

    static void bangunRuang(int pilihan) {
        switch(pilihan) {
            case 1 :
                System.out.print("Input panjang sisi kubus :\n => ");
                double sisi = sc.nextDouble();

                Kubus kubus = new Kubus(sisi);
                System.out.println("Volume          : " + kubus.getVolume());
                System.out.println("Luas Permukaan  : " + kubus.getLuasPermukaan());
                break;
            case 2 :
                System.out.print("Input panjang balok :\n => ");
                double panjang = sc.nextDouble();
                System.out.print("Input lebar balok :\n => ");
                double lebar = sc.nextDouble();
                System.out.print("Input tinggi balok :\n => ");
                double tinggiBalok = sc.nextDouble();

                Balok balok = new Balok(panjang, lebar, tinggiBalok);
                System.out.println("Volume          : " + balok.getVolume());
                System.out.println("Luas Permukaan  : " + balok.getLuasPermukaan());
                break;
            case 3 :
                System.out.print("Input alas prisma :\n => ");
                double alasSegitiga = sc.nextDouble();
                System.out.print("Input tinggi alas prisma :\n => ");
                double tinggiSegitiga = sc.nextDouble();
                System.out.print("Input tinggi prisma :\n => ");
                double tinggiPrisma = sc.nextDouble();

                PrismaSegitiga prismaSegitiga = new PrismaSegitiga(alasSegitiga, tinggiSegitiga, tinggiPrisma);
                System.out.println("Volume          : " + prismaSegitiga.getVolume());
                System.out.println("Luas Permukaan  : " + prismaSegitiga.getLuasPermukaan());
                break;
            case 4 :
                System.out.print("Input jari - jari bola :\n => "); 
                double jarijariBola = sc.nextDouble();

                Bola bola = new Bola(jarijariBola);
                System.out.println("Volume          : " + bola.getVolume());
                System.out.println("Luas Permukaan  : " + bola.getLuasPermukaan());
                break;
            case 5 :
                System.out.print("Input jari - jari tabung :\n => "); 
                double jarijariTabung = sc.nextDouble();
                System.out.print("Input tinggi tabung :\n => "); 
                double tinggiTabung = sc.nextDouble();

                Tabung tabung = new Tabung(jarijariTabung, tinggiTabung);
                System.out.println("Volume          : " + tabung.getVolume());
                System.out.println("Luas Permukaan  : " + tabung.getLuasPermukaan());
                break;
            default :
                break;
        }
    }

    static void bangunDatar(int pilihan) {
        switch (pilihan) {
            case 1 :
                System.out.print("Input sisi persegi :\n => ");
                double sisiPersegi = sc.nextDouble();

                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas     : " + persegi.getLuas());
                System.out.println("Keliling : " + persegi.getKeliling());
                break;
            case 2 :
                System.out.print("Innput panjang :\n => ");
                double panjangPersegiPanjang = sc.nextDouble();
                System.out.print("Innput panjang :\n => ");
                double lebarPersegiPanjang = sc.nextDouble();

                PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Luas     : " + persegiPanjang.getLuas());
                System.out.println("Keliling : " + persegiPanjang.getKeliling());
                break;
            case 3 :
                System.out.print("Input jari jari lingkaran :\n => ");
                double jarijariLingkaran = sc.nextDouble();

                Lingkaran lingkaran = new Lingkaran(jarijariLingkaran);
                System.out.println("Luas     : " + lingkaran.getLuas());
                System.out.println("Keliling : " + lingkaran.getKeliling());
                break;
            case 4 :
                System.out.print("Input alas segitiga :\n => ");
                double alasSegitiga = sc.nextDouble();
                System.out.print("Input tinggi segitiga :\n => ");
                double tinggiSegitiga = sc.nextDouble();
                System.out.print("Input sisi miring segitiga :\n => ");
                double sisiMiringSegitiga = sc.nextDouble();

                Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga, sisiMiringSegitiga);
                System.out.println("Luas     : " + segitiga.getLuas());
                System.out.println("Keliling : " + segitiga.getKeliling());
                break;
            case 5 :
                System.out.print("Input alas trapesium :\n => ");
                double alasTrapesium = sc.nextDouble();
                System.out.print("Input tinggi trapesium :\n => ");
                double tinggiTrapesium = sc.nextDouble();
                System.out.print("Input sisi atas trapesium :\n => ");
                double sisiAtasTrapesium = sc.nextDouble();
                System.out.print("Input sisi miring trapesium :\n => ");
                double sisiMiringTrapesium = sc.nextDouble();

                Trapesium trapesium = new Trapesium(alasTrapesium, tinggiTrapesium, sisiAtasTrapesium, sisiMiringTrapesium);
                System.out.println("Luas     : " + trapesium.getLuas());
                System.out.println("Keliling : " + trapesium.getKeliling());
                break;
            default :
                break;
        }
    }
}