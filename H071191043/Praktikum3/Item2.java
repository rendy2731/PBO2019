package prak;

import java.util.*;

class Item2 {
    private String name;
    private int price;
    private String info;

    static Scanner pew = new Scanner(System.in);

    public Item2 (String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String getInfo(){
        return String.format("Item : %s\n\tDescription : %s\n\tPrice : %d", name, info, price);
    }
    public boolean hpPotion(){
        if(name.equalsIgnoreCase("Hp Potion")){
            return true;
        }
        return false;
    }
    public static void descItem2(Item2 items){
        System.out.println();
        System.out.println("name :" + items.getName());
        System.out.println("price :" + items.getPrice());
        System.out.println();
    }
}