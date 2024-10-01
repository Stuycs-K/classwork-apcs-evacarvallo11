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
    int[] result = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++)
    {
      result[i] = ary1[i];
    }
    int x = 0;
    for (int i = ary1.length; i < result.length; i++)
    {
      result[i] = ary2[x];
      x++;
    }
    return result;
  }
  public static void main(String[] args)
  {
    int[] x = new int[]{1, 2, 3, 4};
    int[] y = new int[]{5, 6, 7, 8};
    System.out.println(arrayToString(returnCopy(x)));
    System.out.print(arrayToString(concatArray(x, y)));
  }


    public static String arrayToString(int[] nums) {
    String fin = "[";
    for (int i = 0; i < nums.length; i++) {
      fin += nums[i] + "";
      if (i < nums.length - 1) {
        fin += ", ";
      }
    }
    return fin + "]";
  }
  }
