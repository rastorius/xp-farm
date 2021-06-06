public class BitsOfInteger{
  public static int reverse_bits(int n) {
    int r = 0;
    while(n != 0) {
      r <<= 1;
      r |= 1 & n; 
      n >>= 1;
    }
    return r;
  }
}