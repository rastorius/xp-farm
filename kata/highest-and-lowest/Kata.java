import java.lang.Math;

public class Kata {
  public static String highAndLow(String numbers) {
    String[] numberArr = numbers.split(" ");
    int min = Integer.parseInt(numberArr[0]);
    int max = min;
    for(int i = 1; i < numberArr.length; ++i) {
      int number = Integer.parseInt(numberArr[i]);
      min = Math.min(min, number);
      max = Math.max(max, number);
    }
    return max + " " + min;
  }
}