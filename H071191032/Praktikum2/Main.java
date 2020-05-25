import java.util.Scanner;
public class Main {
    /*
        Jadi saya hanya membuat 1 class Main untuk 3 nomor soal,
        code untuk class main nomor 1 - 3 ada dibawah setelah main method
    */

    public static void main(String[] args) {
        // No. 3 POKEMON
        Scanner sc = new Scanner(System.in);    
        System.out.println("----------------- Welcome to the Pokemon Battle -----------------\n");
        System.out.print("Player 1 :\nEnter your pokemon name\n => ");
        String poke1Name = sc.nextLine();
        System.out.print("Set your pokemon type:\n1. Fire \t2. Water\n3. Electric\t4. Ground\n => ");
        String poke1Type = sc.nextLine();
        System.out.print("Set your attack point\n => ");
        int poke1Attack = sc.nextInt();
        System.out.print("Set your defense point\n => ");
        int poke1Defense = sc.nextInt();
        System.out.println();

        sc.nextLine();
        System.out.print("Player 2 :\nEnter your pokemon name\n =>");
        String poke2Name = sc.nextLine();
        System.out.print("Set your pokemon type:\n1. Fire \t2. Water\n3. Electric\t4. Ground\n => ");
        String poke2Type = sc.nextLine();
        System.out.print("Set your attack point\n => ");
        int poke2Attack = sc.nextInt();
        System.out.print("Set your defense point\n => ");
        int poke2Defense = sc.nextInt();

        Pokemon poke1 = new Pokemon(poke1Name, poke1Type, poke1Attack, poke1Defense);
        Pokemon poke2 = new Pokemon(poke2Name, poke2Type, poke2Attack, poke2Defense);
        System.out.println("\nThe battle has begun!\n");

        int player1Turn;
        int player2Turn;
        boolean isQuit = false;
        while(!isQuit) {
            if (poke1.isDead() == true || poke2.isDead() == true) {
                if (poke1.isDead()) {
                    System.out.println(poke1.getName() + " is DEAD");
                    System.out.println(poke2.getName() + " WON!");
                    return;
                } else {
                    System.out.println(poke2.getName() + " is DEAD");
                    System.out.println(poke1.getName() + " WON!");
                    return;
                }
            }

            //Player1 turn's
            System.out.println(poke1.getName() + " turn's :");
            System.out.print("1. Launch Attack\n2. Defense\n3. Charge\n4. Quit\n => ");
            player1Turn = sc.nextInt();
            switch (player1Turn) {
                case 1:
                    poke1.launchAttack(poke2);
                    poke2.desc();
                    break;
                case 2:
                    poke1.onDefense();
                    poke2.desc();
                    break;
                case 3:
                    poke1.onCharge();
                    poke2.desc();
                    break;
                case 4:
                    isQuit = true;
            }

            //Player2 turn's
            System.out.println(poke2.getName() + " turn's :");
            System.out.print("1. Launch Attack\n2. Defense\n3. Charge\n4. Quit\n => ");
            player2Turn = sc.nextInt();
            switch (player2Turn) {
                case 1:
                    poke2.launchAttack(poke1);
                    poke1.desc();
                    break;
                case 2:
                    poke2.onDefense();
                    poke1.desc();
                    break;
                case 3:
                    poke2.onCharge();
                    poke1.desc();
                    break;
                case 4:
                    isQuit = true;
            }
        }
    }
}
// No. 1

        // int defense = 15;
        // int attack = 30;
        // Player player1 = new Player("Mino", attack, defense);
        // Player player2 = new Player("Hilda", defense);

        // player2.setAttackPower(35);

        // player1.getDamage(player2);
        // player2.getDamage(player1);
        // player1.status();
        // player2.status();

// No. 2

        // Scanner input = new Scanner(System.in);
        // System.out.print("Input panjang : ");
        // double width = input.nextDouble();
        // System.out.print("Input lebar : ");
        // double height = input.nextDouble();
        // System.out.print("Input tinggi : ");
        // double depth = input.nextDouble();
        // System.out.print("Input massa : ");
        // double mass = input.nextDouble();
        // input.close();

        // Box box = new Box(width, height, depth);
        // box.setMass(mass);
        // System.out.println("Masssa jenis = " + box.getDensity());
        // box.setMass(mass * 2);
        // System.out.println("Massa jenis = " + box.getDensity());

// No. 3 POKEMON

        // Scanner sc = new Scanner(System.in);    
        // System.out.println("----------------- Welcome to the Pokemon Battle -----------------\n");
        // System.out.print("Player 1 :\nEnter your pokemon name\n => ");
        // String poke1Name = sc.nextLine();
        // System.out.print("Set your pokemon type:\n1. Fire \t2. Water\n3. Electric\t4. Ground\n => ");
        // String poke1Type = sc.nextLine();
        // System.out.print("Set your attack point\n => ");
        // int poke1Attack = sc.nextInt();
        // System.out.print("Set your defense point\n => ");
        // int poke1Defense = sc.nextInt();
        // System.out.println();

        // sc.nextLine();
        // System.out.print("Player 2 :\nEnter your pokemon name\n =>");
        // String poke2Name = sc.nextLine();
        // System.out.print("Set your pokemon type:\n1. Fire \t2. Water\n3. Electric\t4. Ground\n => ");
        // String poke2Type = sc.nextLine();
        // System.out.print("Set your attack point\n => ");
        // int poke2Attack = sc.nextInt();
        // System.out.print("Set your defense point\n => ");
        // int poke2Defense = sc.nextInt();

        // Pokemon poke1 = new Pokemon(poke1Name, poke1Type, poke1Attack, poke1Defense);
        // Pokemon poke2 = new Pokemon(poke2Name, poke2Type, poke2Attack, poke2Defense);
        // System.out.println("\nThe battle has begun!\n");

        // int player1Turn;
        // int player2Turn;
        // boolean isQuit = false;
        // while(!isQuit) {
        //     if (poke1.isDead() == true || poke2.isDead() == true) {
        //         if (poke1.isDead()) {
        //             System.out.println(poke1.getName() + " is DEAD");
        //             System.out.println(poke2.getName() + " WON!");
        //             return;
        //         } else {
        //             System.out.println(poke2.getName() + " is DEAD");
        //             System.out.println(poke1.getName() + " WON!");
        //             return;
        //         }
        //     }

        //     //Player1 turn's
        //     System.out.println(poke1.getName() + " turn's :");
        //     System.out.print("1. Launch Attack\n2. Defense\n3. Charge\n4. Quit\n => ");
        //     player1Turn = sc.nextInt();
        //     switch (player1Turn) {
        //         case 1:
        //             poke1.launchAttack(poke2);
        //             poke2.desc();
        //             break;
        //         case 2:
        //             poke1.onDefense();
        //             poke2.desc();
        //             break;
        //         case 3:
        //             poke1.onCharge();
        //             poke2.desc();
        //             break;
        //         case 4:
        //             isQuit = true;
        //     }

        //     //Player2 turn's
        //     System.out.println(poke2.getName() + " turn's :");
        //     System.out.print("1. Launch Attack\n2. Defense\n3. Charge\n4. Quit\n => ");
        //     player2Turn = sc.nextInt();
        //     switch (player2Turn) {
        //         case 1:
        //             poke2.launchAttack(poke1);
        //             poke1.desc();
        //             break;
        //         case 2:
        //             poke2.onDefense();
        //             poke1.desc();
        //             break;
        //         case 3:
        //             poke2.onCharge();
        //             poke1.desc();
        //             break;
        //         case 4:
        //             isQuit = true;