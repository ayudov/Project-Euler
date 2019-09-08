package Tasks;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Problem_14 {
    public static void SolveTask14() {
        Map<Integer, Integer> numbersofsteps = new HashMap<Integer, Integer>();
        for (int i = 1000000; i >= 5; i--){
            numbersofsteps.put(SirakuzSequence(i), i);
        }
        Map<Integer, Integer> sortednumbersofsteps = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        sortednumbersofsteps.putAll(numbersofsteps);
        System.out.println("Answer: " + sortednumbersofsteps.values().stream().findFirst());
    }

    private static long step (long n){
        if(n%2 == 0) return n/2;
        else return 3*n +1;
    }

    private static int SirakuzSequence(int x) {
        long n = x;
        var nb = 0;
        while (n != 1) {
            n = step(n);
            nb++;
        }
        return nb;
    }
}
