package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_8 {
    public static void SolveTask8() {

        //int mult = 1;

        int[] digits = ArrayToList(ReadFromFile());

        List<Double> mult_list = new ArrayList<>();

        System.out.println(digits.length);

        double mult = 1;

        for (int i = 0; i<digits.length-1-13; i++, mult=1){
            for (int j = i; j < i + 13; j++){
                mult *= digits[j];
            }
            mult_list.add(mult);

        }

        System.out.println(mult_list);
        Collections.sort(mult_list);
        System.out.println(mult_list);

        System.out.printf("%f", mult_list.get(mult_list.size()-1));

    }

    private static String ReadFromFile(){
        String line = null;

        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/Tasks/files/problem_8"))) {

            // read line by line
            line = br.readLine();
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return line;
    }

    private static int[] ArrayToList(String line) {
        String[] integerStrings = line.split("");
        int[] integers = new int[line.length()];
        for (int i = 0; i < integers.length ; i++) {
            integers[i] = Integer.parseInt(integerStrings[i]);
        }



        return integers;
    }
}
