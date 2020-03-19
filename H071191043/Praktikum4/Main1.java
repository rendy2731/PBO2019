package app;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Lingkarang lingkarang = new Lingkarang();
        Segitiga segitiga = new Segitiga();
        Trapesium trapesium = new Trapesium();

        BangunRuang bangunRuang = new BangunRuang();
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
        Bola bola = new Bola();
        Tabung tabung = new Tabung();

        System.out.println();
        System.out.println("Welcome");
        System.out.println("Menu");
        System.out.println(" 1. Bangun Datar\n 2. Bangun Ruang\n 3. Quit");
        System.out.println();
        System.out.println("Input Pilihan anda!");

        int pilih = sc.nextInt();
        int pilihan;
        while (true) {
            switch (pilih) {
                case 1:
                    System.out.println();
                    System.out.println("BANGUN DATAR");
                    System.out.println("Menu");
                    System.out.println(" 1. Persegi\n 2. Persegi Panjang\n 3. Lingkarang\n 4. Segitiga\n 5. Trapesium\n 6. Quit");
                    System.out.println();
                    System.out.println("Input pilihan anda!");
                    pilihan = sc.nextInt();
                    switch (pilihan) {
                        case 1:
                            System.out.println("PERSEGI");
                            System.out.println("Input sisi : ");
                            persegi.sisi = sc.nextFloat();
                            persegi.luas();
                            persegi.keliling();
                            break;
                        case 2:
                            System.out.println("PERSEGI PANJANG");
                            System.out.println("Input panjang : ");
                            persegiPanjang.panjang = sc.nextFloat();
                            System.out.println("Input lebar : ");
                            persegiPanjang.lebar = sc.nextFloat();
                            persegiPanjang.luas();
                            persegiPanjang.keliling();
                            break;
                        case 3:
                            System.out.println("LINGKARANG");
                            System.out.println("Input jari jari : ");
                            lingkarang.r = sc.nextFloat();
                            lingkarang.luas();
                            lingkarang.keliling();
                            break;
                        case 4:
                            System.out.println("SEGITIGA");
                            System.out.println("Input alas : ");
                            segitiga.alas = sc.nextFloat();
                            System.out.println("Input tinggi : ");
                            segitiga.tinggi = sc.nextFloat();
                            System.out.println("Input sisi B : ");
                            segitiga.sisiB = sc.nextFloat();
                            System.out.println("Input sisi C : ");
                            segitiga.sisiC = sc.nextFloat();
                            segitiga.luas();
                            segitiga.keliling();
                            break;
                        case 5:
                            System.out.println("TRAPESIUM");
                            System.out.println("Input sisi A : ");
                            trapesium.sisiA = sc.nextFloat();
                            System.out.println("Input sisi B : ");
                            trapesium.sisiB = sc.nextFloat();
                            System.out.println("Input sisi C : ");
                            trapesium.sisiC = sc.nextFloat();
                            System.out.println("Input sisi D : ");
                            trapesium.sisiD = sc.nextFloat();
                            System.out.println("Input tinggi");
                            trapesium.tinggi = sc.nextFloat();
                            trapesium.luas();
                            trapesium.keliling();
                            break;
                        case 6 :
                            if (pilihan == 6) {
                                return;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("BANGUN RUANG");
                    System.out.println("Menu");
                    System.out.println(" 1. Kubus\n 2. Balok\n 3. Prisma Segitiga\n 4. Bola\n 5. Tabung\n 6. Quit");
                    System.out.println();
                    System.out.println("Input pilihan anda!");
                    pilihan = sc.nextInt();
                    switch (pilihan) {
                        case 1:
                            System.out.println("KUBUS");
                            System.out.println("Input sisi : ");
                            kubus.sisi = sc.nextFloat();
                            kubus.luasPermukaan();
                            kubus.volume();
                            break;
                        case 2:
                            System.out.println("BALOK");
                            System.out.println("Input panjang : ");
                            balok.panjang = sc.nextFloat();
                            System.out.println("Input lebar : ");
                            balok.lebar = sc.nextFloat();
                            System.out.println("Input tinggi : ");
                            balok.tinggi = sc.nextFloat();
                            balok.luasPermukaan();
                            balok.volume();
                            break;
                        case 3:
                            System.out.println("PRISMA SEGITIGA");
                            System.out.println("Input alas : ");
                            prismaSegitiga.alas = sc.nextFloat();
                            System.out.println("Input tinggi alas : ");
                            prismaSegitiga.tinggiAlas = sc.nextFloat();
                            System.out.println("Input tinggi prisma : ");
                            prismaSegitiga.tinggiPrisma = sc.nextFloat();
                            prismaSegitiga.luasPermukaan();
                            prismaSegitiga.volume();
                            break;
                        case 4:
                            System.out.println("BOLA");
                            System.out.println("Input jari jari : ");
                            bola.r = sc.nextFloat();
                            bola.luasPermukaan();
                            bola.volume();
                            break;
                        case 5:
                            System.out.println("TABUNG");
                            System.out.println("Input jari jari : ");
                            tabung.r = sc.nextFloat();
                            System.out.println("Input tinggi : ");
                            tabung.tinggi = sc.nextFloat();
                            tabung.luasPermukaan();
                            tabung.volume();
                            break;
                        case 6 :
                            if (pilihan == 6) {
                                return;
                            }
                            break;
                    }
                    break;
                case 3 :
                    if (pilih == 3) {
                    return;
                    }
                    break;
            }
        }
    }
}
