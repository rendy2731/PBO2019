package prak;

class Item {
    private String name;
    private int price;
    private String info;

    public void setName (String name) {
        this.name = name;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public void setInfo (String info) {
        this.info = info;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }
    public String getInfo() {
        return this.info;
    }

    public void use() {}
    public void sell() {}
    public void destory() {}
}