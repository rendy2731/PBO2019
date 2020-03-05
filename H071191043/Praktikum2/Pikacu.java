package prak;

class Pikacu {
    private String name;
    private String type;
    private int damage;
    private int defence;
    private int health;
    private int xp;
    private String winner;
    private String loser;

    public void setName(String name) {
        this.name = name;
    }
    public void settype(String type) {
        this.type = type;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setDefence (int defence) {
        this.defence = defence;
    }
    public void setHealth (int health) {
        this.health = health;
    }
    public void setXp (int xp) {
        this.xp = xp;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getDamage() {
        return damage;
    }
    public int getDefence() {
        return defence;
    }
    public int getHealt() {
        return health;
    }
    public int getXp() {
        return xp;
    }
    
    void attack(Pikacu enemy){
        if (health != 0 && enemy.health != 0) {
            System.out.println("Serang!");
            if (type.equals("Ground") && enemy.getType().equals("Water")) {
                winner = name;
                loser = enemy.getName();
            }
            else if (type.equals("Water") && enemy.getType().equals("Ground")) {
                winner = enemy.getName();
                loser = name;
            }
            else if (type.equals("Fire") && enemy.getType().equals("Water")) {
                winner = enemy.getName();
                loser = name;
            }
            else if (type.equals("Water") && enemy.getType().equals("Fire")) {
                winner = name;
                loser = enemy.getName();
            }
            else if (type.equals("Water") && enemy.getType().equals("Electric")) {
                winner = enemy.getName();
                loser = name;
            }
            else if (type.equals("Electric") && enemy.getType().equals("Water")) {
                winner = name;
                loser = enemy.getName();
            }
            else if (type.equals("Electric") && enemy.getType().equals("Ground")) {
                winner = enemy.getName();
                loser = name;
            }
            else if (type.equals("Ground") && enemy.getType().equals("Electric")) {
                winner = name;
                loser = enemy.getName();
            }
        }
        else if (health == 0 && enemy.health > 0) {
            winner = enemy.getName();
            loser = name;
        }
        else if (health > 0 && enemy.health == 0) {
            winner = name;
            loser = enemy.getName();
        }
        else if (health == 0 && enemy.health == 0) {
            System.out.println("NO ATTACK!");
        }
    }
    void dead() {
        if (health <= 0) {
            System.out.println(name + " is dead");
            System.out.println("\n");
        }
    }
    void description() {
        System.out.println("Name : " + name);
        System.out.println("type : " + type);
        System.out.println("Demage : " + damage);
        System.out.println("Defence : " + defence);
        System.out.println("Health : " + health);
        System.out.println("Xp : " + xp); 
        System.out.println("\n");
    }
    void result() {
        System.out.println(winner + " win");
        System.out.println(loser + " loser");
    }
}
