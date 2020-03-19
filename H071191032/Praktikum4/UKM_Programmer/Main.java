import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static UKMProgrammer member;
    public static void main(String[] args) {
        while(true) {
            UKMProgrammer.display();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addMember();
                    int positionMember = sc.nextInt();
                    switch (positionMember) {
                        case 1: //pengurus inti
                            sc.nextLine();
                            System.out.print("Input your name => ");
                            String n = sc.nextLine();
                            System.out.print("Input your faculty => ");
                            String f = sc.nextLine();
                            System.out.print("Input your major => ");
                            String m = sc.nextLine();
                            System.out.print("Input your NIM => ");
                            String NIM = sc.nextLine();
                            System.out.print("Input your register year => ");
                            int reg = sc.nextInt();
                            member = new UKMProgrammer(n, f, m, NIM, reg);
                            break;
                    
                        default:
                            break;
                    }
                    break;
            
                default:
                    break;
            }
            System.out.println(member.name);
            System.out.println(member.listPengurusInti);

        }
    }

    static void addMember() {
        System.out.println("===== ADD MEMBER =====");
        System.out.println("1. Pengurus Inti");
        System.out.println("2. Koordinator");
        System.out.print("What position ?\n => ");
    }
}