import java.util.*;
import java.io.*;
class Day1 {
    public static String[] parse(String filename)
    {
      try{
      Scanner inf = new Scanner(new File(filename));
      String line = inf.nextLine();
      while (inf.hasNextLine())
      {
        line+= inf.nextLine();
      }
      return line.split(",");
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return null; //you can return from a void function just don't put a value.
    }
    }

  public static String aryToString(String[] nums) {
    String fin = "[";
    for (int i = 0; i < nums.length; i++) {
      fin += nums[i];
      if (i < nums.length - 1) {
        fin += ", ";
      }
    }
    return fin + "]";
  }

  public static int solve(String[] data)
  {
    for (int i = 0; i < data.length; i++)
    {
      
    }
  }

    public static void main(String[] args) {

      System.out.println(aryToString(parse("input.txt")));

    }
  }
