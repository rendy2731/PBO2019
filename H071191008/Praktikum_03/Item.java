package Tugas.Encapsulation;

class Item {
    private String name;
    private int price;
    private String info;
    private boolean isUsed;
    private String useBy;

    Item(String name, Integer price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void getDetails() {
        System.out.println("Name\t: " + name + (isUsed == true ? String.format("[%s]", useBy) : ""));
        System.out.println("Price\t: " + price);
        System.out.println("Info\t: " + info);
    }

    public int getPrice() {
        return price;
    }

    public boolean getUsed() {
        return isUsed;
    }

    public void use(Player player) {
        isUsed = isUsed == true ? false : true;
        useBy = isUsed == true ? player.getName() : "";
        System.out.printf("[%s] use (%s)\n",player.getName(),name);
    }

}