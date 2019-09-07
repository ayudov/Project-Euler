package Tasks;

import java.util.ArrayList;

public class Problem_2{
    private final static int FIRST_DIGIT = 1;
    private final static int SECOND_DIGIT = 2;
    private final static int MAX_VALUE = 4000000;
    private static int index = 2;

    private static ArrayList<Integer> Fibonacci = new ArrayList<>();

    private static long counter;

    public static void SolveTask2(){
        Fibonacci.add(FIRST_DIGIT);
        Fibonacci.add(SECOND_DIGIT);

        while (Fibonacci.get(Fibonacci.size()-1) + Fibonacci.get(Fibonacci.size()-2) < MAX_VALUE){
            Fibonacci.add(Fibonacci.get(index - 1) + Fibonacci.get(index - 2));
            index++;

        }

        for (Integer i:Fibonacci){
            if (i%2 == 0){
                counter += i;
            }

        }
        System.out.println(counter);

    }

}
