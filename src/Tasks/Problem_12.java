package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Problem_12 {

    public static void SolveTask12() {
        for (int i = 2; ;i++){
            if (GetPrimesOfNumber(GetTriangleNumber(i),0, new ArrayList<Integer>()) > 500){
                System.out.println("Answer: " + GetTriangleNumber(i));
                break;
            }

        }

    }

    private static int  GetTriangleNumber(int n){
        return n*(n+1)/2;
    }


    private static int GetPrimesOfNumber(int n, int counter, List<Integer> primes){
        if (!IfPrime(n)){
            for (int i = 2; ;i++){
                if (n % i == 0 && IfPrime(i)) {
                    primes.add(i);
                    counter += 2;
                    return GetPrimesOfNumber(n / i, counter, primes);
                }
            }
        }
        else{
            primes.add(n);
            counter = GetNumberOfDivisors(primes);
            return counter;
        }
    }

    private static int GetNumberOfDivisors(List <Integer> input){
        List<Integer> power = new ArrayList<>();
        Collections.sort(input);
        int mult = 1;
        for (int i = 2; i <= input.get(input.size()-1);i++){
            power.add(Collections.frequency(input, i));
        }
        power.removeAll(Collections.singleton(0));
        for (Integer integer : power) {
            mult *= integer + 1;
        }
        return mult;
    }

    private static boolean IfPrime(int digit){
        if (digit != 1) {
            boolean prime = true;
            for (long p = 2; p < digit; p++) {
                if (digit % p == 0) {
                    prime = false;
                    break;
                }
            }
            return prime;
        }
        else{
            System.out.println("Error, number = 1");
            return false;
        }
    }

}
