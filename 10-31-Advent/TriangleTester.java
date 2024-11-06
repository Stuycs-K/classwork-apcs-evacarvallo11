import java.util.Scanner;

public class TriangleTester{

public static int countTrianglesA(String filename)
{
  Scanner input = new Scanner(filename);

  int count = 0;
  while (filename.hasNextLine())
  {
    if (iftriangle(filename.nextInt(), filename.nextInt(), filename.nextInt()))
    {
      count++;
    }
  }
    return count;
}

public static boolean ifTriangle(int x, int y, int z)
{
  return x + y > z && x + z > y && y + z > x;
}
public static void main(String[] args) {
  System.out.print(ifTriangle(3, 4, 5));
  System.out.print(ifTriangle(3, 2, 6));
  try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      countTrianglesA(input);
      input.close();
}catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
}
public static int countTrianglesB(String filename)
{
    File file = new File("inputTri.text");//1
      Scanner input = new Scanner(file);
 int count = 0;
   ArrayList<Integer>row1 = new ArrayList<Integer>();
   ArrayList<Integer>row2 = new ArrayList<Integer>();
   ArrayList<Integer>row3 = new ArrayList<Integer>();
    while(input.hasNextInt())
   {
     int x = input.nextint();
     int y = input.nextint();
     int z = input.nextint();
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
}
}
