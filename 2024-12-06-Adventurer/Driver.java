public class Driver{
  public static void main(String[] args)
  {
    Adventurer x = new Warrior("Xavier", 40);
    Adventurer y = new Warrior("Justin", 40);
    System.out.println(y.support(x));
    System.out.println(y.support());
    System.out.println(y.specialAttack(x));
  }
}
