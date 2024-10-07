//1. Write both your names + emails at the top of the document as a comment.
// Eva Carvallo evac81@nycstudents.net
// Maya Berchin mayab97@nycstudents.net

public class ArrayMethods {

  public static void main(String[] args)
  {
    int[] test1 = new int[]{1, 2, 3, 4};
    int[] test2 = new int[]{5, 6, 7, 8};
    int[][] test3 = new int[][]{{1, 2, 3}, {4, 5, 6}};
    int[][] test4 = new int[][]{{-1, -2, 3}, {-2, - 5, -6}, {-7, -8, -9}};
    int[][] test5 = new int[][]{{1, 4, 5}, {8, 9, 10}};
    System.out.println(aryToString(test1));
    System.out.println(arrToString(test3));
    System.out.println(arr2DSum(test3));
    System.out.println(arrToString(swapRC(test3)));
    replaceNegative(test4);
    System.out.println(arrToString(test4));
    int[][] copiedArray = copy(test5);
    System.out.println(arrToString(copiedArray));
    test5[1][1] = 11;
    System.out.println(arrToString(copiedArray));
  }

  public static String aryToString(int[] nums) {
    String fin = "[";
    for (int i = 0; i < nums.length; i++) {
      fin += nums[i] + "";
      if (i < nums.length - 1) {
        fin += ", ";
      }
    }
    return fin + "]";
  }
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/


//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
  public static String arrToString(int[][]ary) {
  //this should use arrToString(int[])
    String fin = "[";
    for (int i = 0; i < ary.length; i++) {
      fin += aryToString(ary[i]);
      if (i < ary.length - 1) {
        fin += ", ";
      }
    }
    return fin + "]";
  }

/*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
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

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
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
}
