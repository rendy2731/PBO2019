package prak;

class Player {
    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    Item[] items;

    public void setName (String name) {
        this.name = name;
    }
    public void setRole (String role) {
        this.role = role;
    }
    public void setLeval (int level) {
        this.level = level;
    }
    /* public void setDamage (double Damage) {
        this.damage = damage;
    } */
    public void setHp (double hp) {
        this.hp = hp;
    }
    public void setEnergy (double energy) {
        this.energy = energy;
    }
    public void setMoney (int money) {
        this.money = money;
    }

    public String getName() {
        return this.name;
    }
    public String getRole() {
        return this.role;
    }
    public int getLevel() {
        return this.level;
    }
    public double getDamage() {
        return damage;
    }
    public double getHp() {
        return this.hp;
    }
    public double getEnergy() {
        return this.energy;
    }
    public int getMoney() {
        return this.money;
    }

    public void showStatus() {
        System.out.println("Nama : " + name);
        System.out.println("Role : " + role);
        System.out.println("Level : " + level);
        System.out.println("Damage : " + damage);
        System.out.println("Hp : " + hp);
        System.out.println("Energy : " + energy);
        System.out.println("Money : " + money);
    }
    public void showItems() {
        System.out.println();
        int i = 0;
        for (Item item : items) {
            System.out.printf("%d. %s\n", i + 1,item.getInfo());
            i++;
        }
        System.out.println();
    }
    public boolean attack(Player enemy) {
        if (energy != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean healing (double healing) {
        if (hp < 100) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean buy(Item[] items) {
        return true;
    }
}