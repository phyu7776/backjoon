import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
        
        hour += min/60;
        hour = hour%24;

        min = min%60;

        System.out.println(hour + " " + min);

    }
}