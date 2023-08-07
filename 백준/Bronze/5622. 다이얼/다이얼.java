import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numalpha = br.readLine().split("");

        HashMap<String,Integer> numMap = new HashMap<String, Integer>() {
            {
                put("A", 1);
                put("B", 1);
                put("C", 1);
                put("D", 2);
                put("E", 2);
                put("F", 2);
                put("G", 3);
                put("H", 3);
                put("I", 3);
                put("J", 4);
                put("K", 4);
                put("L", 4);
                put("M", 5);
                put("N", 5);
                put("O", 5);
                put("P", 6);
                put("Q", 6);
                put("R", 6);
                put("S", 6);
                put("T", 7);
                put("U", 7);
                put("V", 7);
                put("W", 8);
                put("X", 8);
                put("Y", 8);
                put("Z", 8);
            }
        };

        int sum = 0;
        for (int i = 0 ;i < numalpha.length; i++) {
            sum += numMap.get(numalpha[i]) + 2;
        }

        System.out.println(sum);
    }
}