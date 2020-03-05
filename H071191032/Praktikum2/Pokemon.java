public class Pokemon {
    private String name, type;
    private int attack, defense, hp;

    //constructor
    public Pokemon(String name, String type, int attack, int defense) {
        this.hp = 100;
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    //getter
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type.toLowerCase();
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getHp() {
        return this.hp; 
    }


    //rules
    public void launchAttack(Pokemon target) {
        if (this.getType().equals("water") && target.getType().equals("fire")) {
            this.attack += this.attack * 0.1;
        } else if (this.getType().equals("ground") && target.getType().equals("water")) {
            this.attack += this.attack * 0.1;
        }  else if (this.getType().equals("electric") && target.getType().equals("water")) {
            this.attack += this.attack * 0.1;
        }  else if (this.getType().equals("ground") && target.getType().equals("electric")) {
            this.attack += this.attack * 0.1;
        }
        target.hp -= (this.attack - (this.defense * 0.2)) ;
        System.out.printf("%s IS ATTACKING %s !!!\n", this.getName().toUpperCase(), target.getName().toUpperCase());
    }

    public void onDefense() {
        this.defense += this.defense * 0.5;
    }

    public void onCharge() {
        this.attack += this.attack * 0.5;
    }


    public boolean isDead() {
        if (this.hp <= 0) return true;
        else return false;
    }

    public void desc() {
        System.out.printf("%s STATUS\n", this.name);
        System.out.println("------------------------");        
        System.out.printf("HP\t\t : %d\n", isDead() ? 0 : this.hp);
        System.out.printf("Attack\t\t : %d\n", this.attack);
        System.out.printf("Defense\t\t : %d\n\n", this.defense);
    }

}