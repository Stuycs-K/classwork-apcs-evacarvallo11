import java.util.Random;
import java.util.Scanner;
public class Game{
  public static void main(String[] args)
  {
    Adventurer player = new CodeWarrior();
    Adventurer enemy = new Warrior("Bob", 15);
    boolean quit = true;
    while(player.getHP() > 0 && enemy.getHP() > 0 && quit)
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
    if (enemy.getHP() > 0)
    {
      Random rng = new Random();
      int x = rng.nextInt(3);
      if (x == 0)
      {
        System.out.println(enemy.attack(player));
      }
      if (x == 1)
      {
        System.out.println(enemy.specialAttack(player));
      }
      if (x == 2)
      {
        System.out.println(enemy.support());
      }
    }
  }
  if (!quit)
  {
    if (enemy.getHP() > player.getHP())
    {
      System.out.println("enemy won");
    }
    if (enemy.getHP() < player.getHP())
    {
      System.out.println("player won");
    }
    if (enemy.getHP() == player.getHP())
    {
      System.out.println("tied");
    }
  }
}
}
