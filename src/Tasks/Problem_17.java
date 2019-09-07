package Tasks;

public class Problem_17 {
    public static void SolveTask17() {
        long sum = 0;
        for (int i = 1; i <=1000; i++){
            sum += CountNumberOfCharacters(i);
        }
        System.out.println(sum);


    }

    private static int CountNumberOfCharacters(int n){
        if (n > 0 && n <= 10){
            return NumberOfCharZeroToTen(n);
        }else if (n > 10 && n <20){
            return NumberOfCharTenToTwenty(n);
        }else if (n>=20 && n < 100){
            return NumberOfCharTwentyToNinetyNine(n);
        }else if (n>=100 && n < 1000){
            return NumberOfCharHundredToThousand(n);
        }else if (n == 1000){
            return 11;
        }
        return n;
    }

    private static int NumberOfCharZeroToTen (int n){
        switch (n){
            case 0: return 0;
            case 1:
            case 2:
            case 6:
            case 10:
                return 3;
            case 3:
            case 7:
            case 8:
                return 5;
            case 4:
            case 5:
            case 9:
                return 4;
        }
        return n;
    }

    private static int NumberOfCharTenToTwenty (int n){
        int teen = 4;
        int een = 3;
        switch (n){
            case 11:
            case 12:
                return 6;
            case 14:
            case 19:
            case 17:
            case 16:
                return (NumberOfCharZeroToTen(n-10)) + teen;
            case 15:
            case 13:
            case 18:
                return (NumberOfCharZeroToTen(n-10)) + een;
        }
        return n;
    }

    private static int NumberOfCharTwentyToNinetyNine (int n){
        int sum = 0;
        int nty = 3;
        int ty = 2;
        int y = 1;
        sum += NumberOfCharZeroToTen(n%10);
        switch ((int)n/10){
            case 2: sum += NumberOfCharZeroToTen((int)n/10)+nty; break;
            case 3:
            case 5:
            case 4:
            case 8:
                sum += NumberOfCharZeroToTen((int)n/10)+y; break;
            case 6:
            case 9:
            case 7:
                sum += NumberOfCharZeroToTen((int)n/10)+ty; break;
        }
        return sum;
    }

    private static int NumberOfCharHundredToThousand (int n){
        int first_digit = NumberOfCharZeroToTen((int) n/100);
        int hundred = 7;
        int and = 3;
        int sum = 0;
        if (n % (int) Math.pow(10, (int) Math.log10(n)) == 0){
            sum = first_digit + hundred;
            return sum;
        }else{
            sum = first_digit + hundred + and + CountNumberOfCharacters(n%100);
            return sum;
        }
        //int sum = hundred_and;


        //sum += NumberOfCharTwentyToNinetyNine(n % (int) Math.pow(10, (int) Math.log10(n)));
//        switch ((int)n/10){
//            case 2: sum += NumberOfCharZeroToTen((int)n/10)+nty; break;
//            case 3:
//            case 5:
//            case 4:
//            case 8:
//                sum += NumberOfCharZeroToTen((int)n/10)+y; break;
//            case 6:
//            case 9:
//            case 7:
//                sum += NumberOfCharZeroToTen((int)n/10)+ty; break;
//        }
        //return sum;
    }
}
