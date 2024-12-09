public class Game{
  public static void main(String[] args)
  {
    Adventurer player = CodeWarrior();
    Adventurer enemy = Warrior();
    while(player.getHP() > 0 && enemy.getHP() > 0)
  {
    System.out.println(player.getName() + ", " + player.getHP() + "HP, " + player.getSpecial() + player.getSpecialName());
    System.out.println(enemy.getName() + ", " + enemy.getHP() + "HP, " + enemy.getSpecial() + enemy.getSpecialName());
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    Scanner userInput = new Scanner(System.in);
    String answer = userInput.nextLine();
    if ()
  }
}
