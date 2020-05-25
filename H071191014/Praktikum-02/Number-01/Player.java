class Player{
  private String name;
  private int hp;
  private int attackPower;
  private int deffense;

  public Player(String name, int deffense){
    this.name = name;
    this.deffense = deffense;
    hp = 100;
  }
  //start
  public Player(String name, int attackPower, int deffense){
    this.name = name;
    this.attackPower = attackPower;
    this.deffense = deffense;
    hp = 100;
  }
  public void setAttackPower(int attackPower){
    this.attackPower = attackPower;
  }
  public int getAttackPower(){
    return attackPower;
  }
  //finish
  public void getDamage(Player enemy){
    hp = hp - (enemy.getAttackPower()-deffense);
  }
  public void status(){
    System.out.println(name+" status");
    System.out.println("Hp = "+hp);
    System.out.println("Deffense = "+deffense);
    System.out.println("Attack = "+attackPower);
  }
}
