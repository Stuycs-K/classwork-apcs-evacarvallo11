
import java.util.*;
import java.io.*;
public class Day3{

public static int countTrianglesA(String filename)
{
  try{
  File file = new File(filename);
  Scanner input = new Scanner(file);

  int count = 0;
  String line;
  while (input.hasNextLine())
  {
    line = input.nextLine();
    String[] parts = line.split("\\s+");

    int a = Integer.parseInt(parts[1]);
    int b = Integer.parseInt(parts[2]);
    int c = Integer.parseInt(parts[3]);
    if (ifTriangle(a, b, c))
    {
      count++;
    }
  }
  return count;
  }catch(FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
}

public static boolean ifTriangle(int x, int y, int z)
{
  return x + y > z && x + z > y && y + z > x;
}


public static int countTrianglesB(String filename)
{
  try{
    File file = new File(filename);//1
      Scanner input = new Scanner(file);
 int count = 0;
   ArrayList<Integer>row1 = new ArrayList<Integer>();
   ArrayList<Integer>row2 = new ArrayList<Integer>();
   ArrayList<Integer>row3 = new ArrayList<Integer>();
     String line;
    while(input.hasNextInt())
   {
     line = input.nextLine();
    String[] parts = line.split("\\s+");

    int x = Integer.parseInt(parts[1]);
    int y = Integer.parseInt(parts[2]);
    int z = Integer.parseInt(parts[3]);
   row1.add(x);
   row2.add(y);
   row3.add(z);
 }
 for (int i = 0; i < row1.size() - 2; i+= 3)
 {
   if (ifTriangle(row1.get(i), row1.get(i + 1), row1.get(i + 2) ))
   {
     count++;
   }
 }
  for (int i = 0; i < row2.size() - 2; i+= 3)
 {
   if (ifTriangle(row2.get(i), row2.get(i + 1), row2.get(i + 2) ))
   {
     count++;
   }
 }
  for (int i = 0; i < row3.size() - 2; i+= 3)
 {
   if (ifTriangle(row3.get(i), row3.get(i + 1), row3.get(i + 2) ))
   {
     count++;
   }
 }
 return count;
}catch(FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
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

  public static void main(String[] args) {
    System.out.println(countTrianglesA("input3.txt"));
    System.out.println(countTrianglesB("input3.txt"));
    /*
    try{
  File file = new File("input3.txt");
  Scanner input = new Scanner(file);

  int count = 0;
  String line;
  while (input.hasNextLine())
  {
    line = input.nextLine();
    String[] parts = line.split("\\\s+");
    System.out.println(parts.length);
    System.out.println(aryToString(parts));
    }
    }catch(FileNotFoundException ex) {
        System.out.println("File not found");
      }
}
*/
}
}
