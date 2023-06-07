import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int exceptRatingX = (int) Math.round(x * 15 / 100.0);
        int sum = 0;

        int[] ratingArr = new int[x];

        for (int i = 0 ; i < x; i++) {
            ratingArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ratingArr);

        for (int i = exceptRatingX ; i < ratingArr.length - exceptRatingX; i++) {
            sum += ratingArr[i];
        }

        System.out.println(Math.round(sum / (x - (exceptRatingX * 2.0))));
    }
}