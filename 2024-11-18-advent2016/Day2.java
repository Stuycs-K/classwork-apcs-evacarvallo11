import java.util.*;
import java.io.*;
class Day2 {
    public static String[] parse(String filename)
    {
      try{
      Scanner inf = new Scanner(new File(filename));
      ArrayList<String> line = new ArrayList<String>();
      while (inf.hasNextLine())
      {
        line.add(inf.nextLine());
      }
      String[] x = new String[line.size()];
      for (int i = 0; i < line.size(); i++)
      {
        x[i] = line.get(i);
      }
      return x;

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

  public static String solve(String[] data)
  {
    int row = 2;
    int column = 0;
    String x = "";
    char[][] keys = new char[][]{{'0', '0', '1', '0', '0'}, {'0', '2', '3', '4', '0'}, {'5', '6','7', '8', '9'}, {'0', 'A', 'B', 'C', '0'}, {'0', '0', 'D', '0', '0'}};
    for (int i = 0; i < data.length; i++)
    {
      for (int j = 0; j < data[i].length(); j++)
      {
        if (data[i].charAt(j) == 'U' && row > 0 && keys[row - 1][column] != '0')
        {
          row--;
        }
        if (data[i].charAt(j) == 'D' && row < 4 && keys[row + 1][column] != '0')
        {
          row++;
        }
        if (data[i].charAt(j) == 'L' && column > 0 && keys[row][column - 1] != '0')
        {
          column--;
        }
        if (data[i].charAt(j) == 'R' && column < 4 && keys[row][column + 1] != '0')
        {
          column++;
        }
      }

      x += keys[row][column];
      }
      return x;
    }

    public static void main(String[] args) {

    System.out.println(solve(parse("input2.txt")));

    }
  }
