public class Player {
    private String name;
    private int hp, attackPower, defense;

    public Player(String name, int defense) {
        this.name = name;
        this.defense = defense;
        hp = 100;
    }

    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        hp = 100;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void getDamage(Player enemy) {
        hp = hp - Math.abs(defense - enemy.getAttackPower());
    }

    public void status() {
        System.out.println(name + " status"); 
        System.out.println("HP = " + hp); 
        System.out.println("Defense = " + defense); 
        System.out.println("Attack = " + attackPower + "\n"); 
    }
    
}