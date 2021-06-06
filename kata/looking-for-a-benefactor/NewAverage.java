import java.util.Arrays;
import java.lang.Math;

public class NewAverage {
    public static long newAvg(double[] arr, double navg) {
        long result = (long) Math.ceil(navg * (arr.length + 1) - Arrays.stream(arr).sum());
        if(result < 1L) {
            throw new IllegalArgumentException();
        } else {
            return result;
        }
    }
}