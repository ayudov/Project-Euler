package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Problem_13 {
    public static void SolveTask13() {

        List<Double> digits = StringToIntArray(ReadFromFile());
        double sum = 0;
        for (Double digit : digits) {
            sum += digit;
        }
        while (sum >= 10000000000L){
            sum /= 10;
        }
        System.out.print(Math.round(sum));
    }

    private static String ReadFromFile(){
        StringBuilder sb = new StringBuilder();
        String output = null;
        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/Tasks/files/problem_13"))) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            output = sb.toString();
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return output;
    }

    private static List<Double> StringToIntArray(String input){
        String[] stringsArray = input.split("\n");
        List<Double> output = new ArrayList<>();
        for (String s : stringsArray) {
            output.add(Double.parseDouble(s));
        }

        return output;
    }


}
