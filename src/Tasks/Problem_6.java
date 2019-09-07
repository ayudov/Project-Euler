package Tasks;

public class Problem_6 {
    public static void SolveTask6(){
        System.out.println(Find_sq_sum()-Find_sum_sq());
    }

    private static int Find_sum_sq(){
        int sum=0;
        for (int i=1; i <= 100; i++){
            sum += Math.pow(i, 2);

        }
        return sum;
    }

    private static int Find_sq_sum(){
        int sum=0;
        for (int i=1; i <= 100; i++){
            sum += i;

        }
        return (int) Math.pow(sum, 2);
    }
}
