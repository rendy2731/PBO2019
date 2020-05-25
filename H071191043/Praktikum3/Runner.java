package prak;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Scanner efr = new Scanner(System.in);
        int[] array = new int[10];
        Field field = new Field(array);
        List <Frog> frogs = new ArrayList<>();
        Random randm = new Random();
        String warna[] = {"merah" , "biru", "kuning", "hijau", "orange", "putih", "hitam", "abu-abu", "cream", "cokelat"};
        for(int i = 0 ; i < 10; i++) {
            field.setTinggiBambu(i, randm.nextInt(10)+1);
            frogs.add(new Frog(warna[i], randm.nextInt(10)));
        }
        int counter = 0;
        System.out.println("tinggi bambu ");
        for(int i = 0; i < 10; i++) {
            System.out.println(field.getTinggiBambu(i));
        }
        while(true){
            System.out.println("mulai lompat?");
            System.out.println("1. run");
            System.out.println("2. quit");
            int run = efr.nextInt();
            if(run == 1){
                if (counter < 10){
                    frogs.get(counter).getRun(field);
                    counter++;
                }
                else {
                    return;
                }
                
            } 
            else{
                return;
            }
        }
    }
}