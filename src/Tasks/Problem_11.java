package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_11 {
    public static void SolveTask11() {

        int[][] numbers = StringToIntArray(ReadFromFile());
        //double max_in_row = SumInARow(numbers).get(SumInARow(numbers).size()-1);
        System.out.printf("In Row: %f\n", MaxSumInARow(numbers));
        //double max_in_col =SumInACol(numbers).get(SumInACol(numbers).size()-1);
        System.out.printf("In Col: %f\n", MaxSumInACol(numbers));
        System.out.printf("In right Diag: %f\n", MaxSumInDiagLeft(numbers));
        System.out.printf("In right Diag: %f\n", MaxSumInDiagRight(numbers));
    }

    private static String ReadFromFile(){
        StringBuilder sb = new StringBuilder();
        String output = null;
        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/Tasks/files/problem_11"))) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            output = sb.toString();
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        //System.out.println(sb);
        return output;
    }

    private static int[][] StringToIntArray(String input){
        String[] stringsArray1 = input.split("\n");
        String[][] stringsArray = new String[20][20];
        //System.out.println("------\n" + stringsArray1[stringsArray1.length-1]);
        for (int i = 0; i < stringsArray1.length;i++){
            stringsArray[i] = stringsArray1[i].split(" ");
        }

        int[][] output = new int[20][20];
        for (int i = 0; i < stringsArray.length;i++){
            for (int j = 0; j < stringsArray.length; j++){
                output[i][j] = Integer.parseInt(stringsArray[i][j]);
            }
        }

        return output;
    }

    private static double MaxSumInARow(int[][] input){
        List<Double> mult_list = new ArrayList<>();
        double mult = 1;

        for (int i = 0; i < input.length; i++, mult = 1){
            for (int j = 0; j < input.length-3; j++, mult = 1){
                for (int k = j; k < j+4; k++) {
                    mult *= input[i][k];
                }
                mult_list.add(mult);
            }
        }
        Collections.sort(mult_list);
        return mult_list.get(mult_list.size()-1);
    }

    private static double MaxSumInACol(int[][] input){
        List<Double> mult_list = new ArrayList<>();
        double mult = 1;

        for (int i = 0; i < input.length; i++, mult = 1){
            for (int j = 0; j < input.length-3; j++, mult = 1){
                for (int k = j; k < j+4; k++) {
                    mult *= input[k][i];
                }
                mult_list.add(mult);
            }
        }
        Collections.sort(mult_list);
        return mult_list.get(mult_list.size()-1);
    }

    private static double MaxSumInDiagLeft(int[][] input){
        List<Double> mult_list = new ArrayList<>();
        double mult = 1;

        for (int i = 0; i < input.length-3; i++, mult = 1){
            for (int j = 0; j < input.length-3; j++, mult = 1) {
                mult = input[i][j] * input[i+1][j+1] * input[i+2][j+2] * input[i+3][j+3];
                mult_list.add(mult);
            }
        }
        Collections.sort(mult_list);
        return mult_list.get(mult_list.size()-1);
    }

    private static double MaxSumInDiagRight(int[][] input){
        List<Double> mult_list = new ArrayList<>();
        double mult = 1;

        for (int i = 0; i < input.length-3; i++, mult = 1){
            for (int j = 3; j < input.length; j++, mult = 1) {
                mult = input[i][j] * input[i+1][j-1] * input[i+2][j-2] * input[i+3][j-3];
                mult_list.add(mult);
            }
        }
        Collections.sort(mult_list);
        return mult_list.get(mult_list.size()-1);
    }
}
