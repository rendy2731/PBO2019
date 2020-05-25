import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENGHITUNG GAJI PEGAWAI =====");
            System.out.print("Input nama pegawai => ");
            String name = sc.nextLine();
            System.out.println("Pilih jabatan (1-3):");
            System.out.println("1. Dosen");
            System.out.println("2. Staff");
            System.out.println("3. Pegawai biasa");
            System.out.print("=> ");
            int jabatan = sc.nextInt();
            switch (jabatan) {
                case 1: // dosen
                    System.out.print("Jumlah SKS => ");
                    int sks = sc.nextInt();
                    Pegawai dosen = new Dosen(name, sks);
                    dosen.showInfo();
                    break;
                case 2 : // staff
                    System.out.print("Jumlah Kehadiran => ");
                    int kehadiran = sc.nextInt();
                    Pegawai staff = new Staff(name, kehadiran);
                    staff.showInfo();
                    break;
                case 3 : // pegawai biasa
                    Pegawai pegawai = new Pegawai(name);
                    pegawai.showInfo();
                    break;
                default:
                    System.err.println("Jabatan tidak ditemukan.");
                    break;
            }
            
            while (true) {
                System.out.println("\nApakah anda ingin lanjut ? (y/n)");
                System.out.print("=> ");
                String yesOrNo = sc.next();
                if (yesOrNo.equalsIgnoreCase("y")) break;
                else if (yesOrNo.equalsIgnoreCase("n")) return;
                else System.out.println("Tolong input 'y' atau 'n'");
            }
            sc.nextLine();
        }
    }
}