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
      return line.split(", ");
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return new String[0];
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
    int x = 0;
    int y = 0;
    int facing = 0;
    int[][] offset = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1,0}};
    ArrayList<String> visited = new ArrayList<String>();
    visited.add(x + "," + y);
    for (int i = 0; i < data.length; i++)
    {
      String dir = data[i].substring(0, 1);
      int dist = Integer.parseInt(data[i].substring(1));
      if (dir.equals("L"))
        {
          facing = (facing - 1 + 4) % 4;
        }
      if (dir.equals("R"))
      {
        facing = (facing + 1) % 4;
       }
       for (int j = 0; j < dist; j++)
       {
         x+= offset[facing][0];
         y+= offset[facing][1];
         boolean before = false;
         for (int k = 0; k < visited.size(); k++)
         {
            if (visited.get(k).equals(x + "," + y))
            {
              before = true;
            }
         }
         if (before)
         {
           return Math.abs(x) + Math.abs(y);
         }
        visited.add(x + "," + y);

       }
}
    return Math.abs(x) + Math.abs(y);
}



    public static void main(String[] args) {

    System.out.println(solve(parse("input.txt")));

    }
  }
