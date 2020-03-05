package Tugas.Modul_02;

class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    Player (String name, Integer defense) {
        this.name = name;
        this.defense = defense;
        hp = 100;
    }
    
    Player (String name, Integer attackPower, Integer defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        hp = 100;
    }

    public void getDamage (Player enemy) {
        hp = hp - Math.abs(defense - enemy.getAttackPower());
    }

    public void status () {
        System.out.println("\n" + name + " Status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower);
    }

    public void setAttackPower (int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower () {
        return attackPower;
    }
}