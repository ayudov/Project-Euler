package Tasks;

public class Problem_15 {

    public static void SolveTask15() {

        int GRID = 20;
        System.out.printf("%.0f", FindNumberOfRoutes(GRID, GRID));
    }

    private static double FindNumberOfRoutes(int width, int height){
        return Factorial(width+height)/(Factorial(width)*Factorial(height));
    }

    private static double Factorial(double n){
        if (n == 0)
            return 1;
        else
            return(n * Factorial(n-1));
    }
}
