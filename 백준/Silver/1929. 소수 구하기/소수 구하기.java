import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[last + 1];

        for(int i = 2; i <= last; i++) {
            if(prime[i]) continue;

            if(i >= first) sb.append(i).append('\n');

            for(int j = i + i; j <= last; j += i) {
                prime[j] = true;
            }
        }

        System.out.println(sb);
    }
}