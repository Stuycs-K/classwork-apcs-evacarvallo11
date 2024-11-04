import java.util.Scanner;

public class TriangleTester{

public static int countTrianglesA(String filename)
{
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
}
}
