package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Problem_7 {
    private static List<Integer> array = new ArrayList<>();

    public static void SolveTask7() {
        for (int i=2; ;i++){
            boolean prime = true;
            for (int p = 2; p < i; p++) {
                if (i % p == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime){
                array.add(i);
                System.out.println(i + " is a prime number.");
                if (array.size() == 10001){
                    System.out.println(array);
                    System.out.println(array.get(array.size()-1) + " is a 10001 prime number.");
                    break;
                }
            }
            else
                System.out.println(i + " is not a prime number.");
        }
    }
}
