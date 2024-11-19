import java.util.*;
import java.io.*;
class Day1 {
    public static[] parse(String filename)
    {
      Scanner inf = new Scanner(File(filename));
      String line = inf.nextLine();
      while (inf.hasNextLine())
      {
        line+= inf.nextLine();
      }
      return inf.split(",");
    }
    public static void main(String[] args) {
      try {
      File file = new File("input.java");
      System.out.println(parse(file).toString());


    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
    }
  }
