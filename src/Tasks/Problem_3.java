package Tasks;

public class Problem_3 {
    private static final double NUMBER = 600851475143.0;

    public static void SolveTask3() {
        boolean prime = false;
        int delitel = 2;
        double number = NUMBER / delitel;
        while (!prime) {
            if (number%1 == 0) {
                for (double p = 2.0; p < Math.ceil(Math.sqrt(number)); p++) {
                    if (number % p == 0) {
                        prime = false;
                        delitel++;
                        number = NUMBER/(delitel);
                        break;
                    } else {
                        prime = true;
                    }
                }
            } else {
                delitel++;
                number = NUMBER/(delitel);
            }
        }
        System.out.println("Ответ:" + number);
    }

}