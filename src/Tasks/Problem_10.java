package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_10 {

    private static final int MAX = 2000000;

    public static void SolveTask10() {
        boolean[] eratosfenbool = EratosfenBool();
        long[] eratosfenint = EratosfenInt(eratosfenbool);
        List<Long> primes = Primes(eratosfenint, eratosfenbool);
        System.out.println("Answer: " + SumOfPrimes(primes));
    }

//    private static boolean CheckIfPrime(long digit){
//        if (digit != 1) {
//            boolean prime = true;
//            for (long p = 2; p < digit; p++) {
//                if (digit % p == 0) {
//                    prime = false;
//                    break;
//                }
//            }
//            return prime;
//        }
//        else{
//            System.out.println("Error, number = 1");
//            return false;
//        }
//
//    }
    private static boolean[] EratosfenBool(){
        boolean[] primes =new boolean[MAX+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }
        return primes;

    }

    private static long[] EratosfenInt(boolean[] eratosfenbool){
        long[] eratosfenint = new long [MAX+1];
        for (int i = 0; i<eratosfenbool.length;i++){
            eratosfenint[i] = i;
        }
        return eratosfenint;
    }

    private static List<Long> Primes(long[] eratosfetint, boolean[] eratosfenbool){
        List<Long> primes = new ArrayList<>();
        for (int i = 0; i<eratosfenbool.length;i++){
            if (eratosfenbool[i]){
               primes.add(eratosfetint[i]);
            }
        }
        return primes;
    }

    private static long SumOfPrimes(List<Long> primes){
        long sum = 0;
        for (Long prime : primes) {
            sum += prime;
        }
        return sum;
    }
}

