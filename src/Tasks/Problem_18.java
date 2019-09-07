package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Problem_18 {
    public static void SolveTask18() {
        String string_digits = ReadFromFile();
        int [][] digits = StringToIntArray(string_digits);


    }

    private static String ReadFromFile(){
        StringBuilder sb = new StringBuilder();
        String output = null;
        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/Tasks/files/problem_18"))) {
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

    private static int[][] StringToIntArray(String input){
        String[] stringsArray1 = input.split("\n");
        String[][] stringsArray2 = new String [stringsArray1.length][];
        for (int i = 0; i<stringsArray1.length; i++) {
            stringsArray2[i] =  stringsArray1[i].split(" ");
        }

        int[][] output = new int [stringsArray2.length][];
        for (int i = 0; i<stringsArray2.length; i++){
            output[i] = new int [stringsArray2[i].length];
            for (int j = 0; j < stringsArray2[i].length;j++){
                output[i][j] = Integer.parseInt(stringsArray2[i][j]);
            }
        }
        return output;
    }

//    private static int FindBiggerSum(int [][] input){
//        int sum = input[0][0];
//
//        for (int i = 1; i < input.length;i++){
//            sum += FindBiggerInRow(FindIndexByTarget(input[i-1],))
//        }
//        return sum;
//    }

//    private static int FindBiggerInRow(int j, int[] input_array){
//        if( input_array[j] > input_array[j+1]){
//            return input_array[j];
//        } else if (input_array[j] < input_array[j+1]){
//            return input_array[j+1];
//        }
//    }

    public static int FindIndexByTarget(int[] a, int target)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;

        return -1;
    }


}
