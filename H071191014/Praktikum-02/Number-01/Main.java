public class Main{
  public static void main(String[] args) {
    int deffense = 15;
    int attack = 30;
    Player player1 = new Player("mino", attack, deffense);
    Player player2 = new Player("hilda",deffense);

    player2.setAttackPower(35);

    player1.getDamage(player2);
    player2.getDamage(player1);
    player1.status();
    player2.status();
  }
}
