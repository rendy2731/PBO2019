package polymorphism;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();
        Staf staf = new Staf();
        Dosen dosen = new Dosen();
        
        System.out.print("Nama Staf ::> ");
        staf.setName(sc.next());
        System.out.print("Jumlah Kehadiran ::> ");
        staf.setPresence(sc.nextInt());

        System.out.print("Nama Dosen ::> ");
        dosen.setName(sc.next());
        System.out.print("Jumlah SKS ::> ");
        dosen.setSks(sc.nextInt());

        System.out.print("Nama Pegawai ::> ");
        pegawai.setName(sc.next());
        System.out.println();
        
        pegawai.getSalary();
        pegawai = staf;
        pegawai.getSalary();
        pegawai = dosen;
        pegawai.getSalary();
    }
}