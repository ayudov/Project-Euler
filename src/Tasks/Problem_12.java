package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Problem_12 {

    public static void SolveTask12() {
        System.out.println(GetPrimesOfNumber(76576500, 0, new ArrayList<Integer>()));
        System.out.println(GetPrimesOfNumber(76576500, 0, new ArrayList<Integer>()));

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
//        System.out.println("Counter: " + counter);
//        System.out.println("input n: " + n);
        //List<Integer> primes = new ArrayList<>();
        if (!IfPrime(n)){
            for (int i = 2; ;i++){
                if (n % i == 0 && IfPrime(i)) {
                    primes.add(i);
                    counter += 2;
                    //System.out.println("Prime divisor: " + i);
                    //System.out.println("Counter: " + counter);
                    //counter =
                    //System.out.println("Popal syda");
                    //System.out.println("Counter: " + counter);
                    return GetPrimesOfNumber(n / i, counter, primes);
                }
            }
        }
        else{
            primes.add(n);
            counter += 2;
            //System.out.println("Final counter: " + counter);
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

    private static void Mult(int number){
        for (int i = 2; i <= number; i++) {
            for (int j = 2; j <= i; j++) {
                if (number % j == 0) {
                    System.out.print(j + ",");
                    number = number / j;
                }

            }
        }
    }
}
