package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_4 {
    private static final int MIN = 100;
    private static final int MAX = 999;
    private static boolean found = false;
    private static int a;
    private static int b;
    private static List<Integer> array = new ArrayList<Integer>();

    public static void SolveTask4(){
        a = MAX;
        b = MAX;

        for (int a = MAX, i = 0;a >= MIN; a--, i++){
            for (int b = MAX;b >= MIN; b--, i++){
                if(CheckIfPalindrome(a, b)){
                   array.add(a*b);
                }
            }
        }
        Collections.sort(array);
        System.out.println(array.get(array.size()-1));

    }

    private static boolean CheckIfPalindrome(int i, int j){
        int r,sum=0,temp;
        int origin = i*j;
        int n=origin;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            //System.out.println(origin + " is s palindrome number " + i + " * " + j);
            return true;
        }
        else{
            //System.out.println(origin + " is not palindrome");
            return false;
        }
    }

}
