import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] bucket = new int[n];

        for (int i = 0; i < bucket.length ; i++) {
            bucket[i] = i+1;
        }

        for (int i = 0; i < m ; i++) {
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            reverseBall(bucket, (j - 1), (k - 1));
        }

        for (int i : bucket) {
            System.out.print(i + " ");
        }
    }

    public static void reverseBall (int[] bucket, int j, int k) {

        while(j < k) {
            int temp = bucket[j];
            bucket[j++] = bucket[k];
            bucket[k--] = temp;
        }
    }
}