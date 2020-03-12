import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int bambooHeight[] = new int[10];
        String colors[] = {"Red", "Yellow", "Green", "Blue", "Purple",
                            "Orange", "Gold", "Grey", "Black", "White"};

        for (int i = 0; i < 10; i++) {
            bambooHeight[i] = rand.nextInt(10) + 1;
        }

        Field field = new Field(bambooHeight);
        Frog frogs[] = new Frog[10];

        for (int i = 0; i < 10; i++) {
            frogs[i] = new Frog(colors[i], rand.nextInt(11) + 1);
        }

        System.out.println("Loncatan tertinggi kodok = " + Frog.getMax(frogs));

        for (int i = 0; i < 10; i++) {
            frogs[i].getProcess(field);
        }
    }   
    
}