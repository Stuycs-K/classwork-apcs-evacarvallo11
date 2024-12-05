import java.util.Random;
public class Driver{
  public static void main(String[]args){
      for (int j = 0; j <= 30; j++)
      {
        Text.go(0, j);
        Text.color(Text.background(Text.CYAN));
        System.out.print(".");
      }
      for (int j = 0; j <= 30; j++)
      {
        Text.go(80, j);
        Text.color(Text.background(Text.CYAN));
        System.out.print(".");
      }

      for (int j = 0; j <= 80; j++)
      {
        Text.go(j, 0);
        Text.color(Text.background(Text.CYAN));
        System.out.print(".");
      }
      for (int j = 0; j <= 80; j++)
      {
        Text.go(j, 30);
        Text.color(Text.background(Text.CYAN));
        System.out.print(".");
      }

      int[] ary = new int[3];
      Random rng = new Random();
      ary[0] = rng.nextInt(100);
      rng = new Random();
      ary[1] = rng.nextInt(100);
      rng = new Random();
      ary[2] = rng.nextInt(100);
      Text.go( (int) 30 / 3, 80);
      if (ary[0] < 25)
      {
        Text.color(Text.RED, Text.BRIGHT);
        System.out.print(ary[0]);
      }
      else{
        if (ary[0] > 75)
        {
        Text.color(Text.GREEN, Text.BRIGHT);
        System.out.print(ary[0]);
        }
      System.out.print(ary[0]);

      }

      Text.go((80 / 3) * 2 , 29);
      if (ary[1] < 25)
      {
        Text.color(Text.RED, Text.BRIGHT);
        System.out.print(ary[1]);
      }
      else{
        if (ary[1] > 75)
        {
        Text.color(Text.GREEN, Text.BRIGHT);
        System.out.print(ary[1]);
        }
      System.out.print(ary[1]);

      }
      Text.go((80 / 3) * 2 , 29);
      if (ary[2] < 25)
      {
        Text.color(Text.RED, Text.BRIGHT);
        System.out.print(ary[2]);
      }
        else{
        if (ary[2] > 75)
        {
        Text.color(Text.GREEN, Text.BRIGHT);
        System.out.print(ary[2]);
        }
      System.out.print(ary[2]);

      }
        for (int j = 0; j <= 80; j++)
      {
        Text.go(j, 28);
        Text.color(Text.background(Text.CYAN));
        System.out.print("?");
      }
      */
      Text.go(0, 37);
      System.out.print(Text.RESET);
    }
}
