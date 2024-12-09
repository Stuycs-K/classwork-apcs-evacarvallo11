public class Game{
  public static void main(String[] args)
  {
    Adventurer player = CodeWarrior();
    Adventurer enemy = Warrior();
    boolean quit = true;
    boolean wins = true;
    while(player.getHP() > 0 && enemy.getHP() > 0 && quit && wins)
  {
    System.out.println(player.getName() + ", " + player.getHP() + "HP, " + player.getSpecial() + player.getSpecialName());
    System.out.println(enemy.getName() + ", " + enemy.getHP() + "HP, " + enemy.getSpecial() + enemy.getSpecialName());
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    Scanner userInput = new Scanner(System.in);
    String answer = userInput.nextLine();
    boolean valid = true;
    while (valid)
    {
    if (answer.equals("a") || answer.equals("attack"))
    {
      System.out.print(player.attack(enemy));
      valid = false;
    }
    if (answer.equals("sp") || answer.equals("special"))
    {
      System.out.print(player.specialAttack(enemy));
      valid = false;
    }
    if (answer.equals("su") || answer.equals("support"))
    {
      System.out.print(player.support());
      valid = false;
    }
    if (answer.equals("quit"))
    {
      quit = false;
      valid = false;
    }
    if (!answer.equals("sp") && !answer.equals("special") && !answer.equals("a") && !answer.equals("attack") && !answer.equals("su") && !answer.equals("support") && !answer.equals("quit"))
    {
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    }
  }

  }

}
