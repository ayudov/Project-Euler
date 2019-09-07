package Tasks;

import java.math.*;

public class Problem_16 {
    private static final int POWER = 1000;
    public static void SolveTask16() {

        System.out.println(TakeSumOfDigits(TakeTwoPowerOf(POWER)));

    }

    private static BigInteger TakeTwoPowerOf (int n){
        BigInteger b = BigInteger.valueOf(2);
        return  b.pow(n);
    }

    private static BigInteger TakeSumOfDigits(BigInteger n){
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger a = BigInteger.valueOf(0);
        BigInteger ten = BigInteger.valueOf(10);
        while (n.compareTo(a)>0) {
            sum = sum.add(n.divideAndRemainder(ten)[1]);
            n = n.divide(ten);
        }
        return sum;
    }
}
