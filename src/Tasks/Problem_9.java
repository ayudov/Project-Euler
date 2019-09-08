package Tasks;

public class Problem_9 {
    private static int a = 1;
    private static int b = 1;

    public static void SolveTask9() {
        loop:
        for (; a<=1000; a++){
            for (; b<=1000; b++){
                int c;
                for (c = 1; c <=1000; c++){
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
                        if (a + b + c == 1000){
                            System.out.println("Ответ: Троица: a=" + a + ", b= "+ b + "c= " + c + "\n" +
                                    "Произведение: " + a*b* c);
                            break loop;
                        }
                    }
                }
            }
        }
    }
}
