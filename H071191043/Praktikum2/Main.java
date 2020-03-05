package prak;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("//Class Player");
        int defense = 15;
        int attack = 30;
        Player player1 = new Player ("Mino", attack, defense);
        Player player2 = new Player ("Hilda", defense);
        player2.setAttackPower(35);

        player1.getDemage(player2);
        player2.getDemage(player1);
        player1.status();
        player2.status();

        System.out.println("\n//Class Box");
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        double depth = input.nextDouble();
        double mass = input.nextDouble();

        Box box = new Box (width, height, depth);
        box.setMass(mass);
        System.out.println("Massa jenis = " + box.getDensity());
        box.setMass(mass*2);
        System.out.println("Massa jenis = " + box.getDensity());

        Pikacu pika1 = new Pikacu();
        Pikacu pika2 = new Pikacu();

        System.out.println("\n//Class Pikacu");
        pika1.setName("Pika1");
        pika1.settype("Ground");
        pika1.setDamage(100);
        pika1.setDefence(100);
        pika1.setXp(100);
        pika1.setHealth(100);
        
        pika2.setName("Pika2");
        pika2.settype("Water");
        pika2.setDamage(100);
        pika2.setDefence(100);
        pika2.setHealth(0);
        pika2.setXp(50);

        pika1.description();
        pika2.description();

        pika1.dead();
        pika2.dead();

        pika1.attack(pika2);
        pika2.attack(pika1);

        pika1.result();
    }
}