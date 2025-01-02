public class Fib{
  public int fb(int n)
  {
    if (n < 2)
    {
      return n;
    }
    else
    {
      return fb(n - 1) + fb(n - 2);
    }
  }
  
}
