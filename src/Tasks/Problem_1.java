package Tasks;

public class Problem_1 {
    public static void SolveTask1(){
        long counter = 0;
        for (int i = 0; i < 1000; i++){
            if (i%3 == 0 || i%5 == 0){
                counter += i;
            }
        }
        System.out.println(counter);
    }
}
