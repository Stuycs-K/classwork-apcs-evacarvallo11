public class MyArrays
{
  public static int[] returnCopy(int[]ary)
  {
    int[] copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++)
    {
      copy[i] = ary[i];
    }
    return copy;
  }
  public static int[] concatArray(int[]ary1,int[]ary2)
  {
    int[] copy = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++)
    {
      copy[i] = ary1[i];
    }
    for (int i = ary1.length; i < ary2.length; i++)
    {
      copy[i] = ary2[i];
    }
    return copy;
  }
  public static void Main(String[] args)
  {
    x = {1, 2, 3, 4};
    y = {5, 6, 7, 8};
    System.out.println("expected", arrayToString(x), "my function", arrayToString(returnCopy(x)));
    System.out.print("expected", arrayToString(x), arrayToString(y), "my function", arrayToString(concatArray(x, y)));
  }
}
