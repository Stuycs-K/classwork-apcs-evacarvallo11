import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[] test1 = new int[]{1, 2, 3, 4};
    int[][] test3 = new int[][]{{1, 2, 3}, {4, 5, 6}};
    int[][] test4 = new int[][]{{-1, -2, 3}, {-2, - 5, -6}, {-7, -8, -9}};
    int[][] test5 = new int[][]{{1, 4, 5}, {8, 9, 10}};
    System.out.println("my function" + arrToString(test1) + " arrays.toString function" + Arrays.toString(test1));
    System.out.println(arrToString(test3));
    System.out.println(arr2DSum(test3));
    System.out.println(arrToString(swapRC(test3)));
    replaceNegative(test4);
    System.out.println(arrToString(test4));
    int[][] copiedArray = copy(test5);
    System.out.println(arrToString(copiedArray));
    test5[1][1] = 11;
    System.out.println(arrToString(copiedArray));
    System.out.println(htmlTable(test5));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String fin = "[";
    for (int i = 0; i < ary.length; i++) {
      fin += ary[i] + "";
      if (i < ary.length - 1) {
        fin += ", ";
      }
    }
    return fin + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
     String fin = "[";
    for (int i = 0; i < ary.length; i++) {
      fin += arrToString(ary[i]);
      if (i < ary.length - 1) {
        fin += ", ";
      }
    }
    return fin + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length;i++)
    {
      for (int j = 0; j < nums[i].length; j++)
      {
        if (nums[i][j] == 0)
        {
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
    {
      for (int x = 0; x < nums[i].length; x++)
      {
        sum+=nums[i][x];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }


  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.

   public static int[][] copy(int[][] nums){
    int[][] len0 = new int[0][0];
    if (nums.length == 0)
    {
      return len0;
    }
    int[][] result = new int[nums.length][];
    for (int i = 0; i < nums.length; i++)
    {
      result[i] = copyRow(nums[i]);
    }
    return result;
  }

public static int[] copyRow(int[] nums)
{
  int[] len0 = new int[0];
  if (nums.length == 0)
  {
    return len0;
  }
  int[] result = new int[nums.length];
  for (int i = 0; i < nums.length; i++)
  {
    result[i] = nums[i];
  }
  return result;
}

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++)
    {
      for (int x = 0; x < nums[0].length; x++)
      {
        result[x][i] = nums[i][x];
      }
    }
    return result;
  }


  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String x = "<table>";
    for (int i = 0; i < nums.length; i++)
    {
      x+= "<tr>" + htmlT(nums[i]) + "</tr>";
    }
    return x + "</table>";
  }

  public static String htmlT(int[] nums)
  {
    String x = "";
    for (int i = 0; i < nums.length; i++)
    {
      x+= "<td>" + nums[i] + "</td>";
    }
    return x;
  }
}
