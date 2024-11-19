import java.util.HashMap;

public class FABONACISERIES {
    public static HashMap<Integer, Long> mun = new HashMap<>();

    public static long fibonacci(int mu) {
        if (mu == 0) {
            return 0;
        }
        if (mu == 1) {
            return 1;
        }
        if (mun.containsKey(mu)) {
            return mun.get(mu);
        }
        long mune = fibonacci(mu - 1) + fibonacci(mu - 2);
        mun.put(mu, mune);
        return mune;
    }

    public static void main(String[] args) {
        int mun = 130;
        long munee = fibonacci(mun);
        System.out.println("The " + mun + "-th term in the Fibonacci series is: " + munee);
    }
}
