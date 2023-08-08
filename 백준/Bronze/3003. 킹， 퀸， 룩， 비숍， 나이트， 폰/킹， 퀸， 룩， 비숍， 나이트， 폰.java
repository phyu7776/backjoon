import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] chess = new int[]{1,1,2,2,2,8};

        for (int i = 0; i < chess.length ; i++ ){
            chess[i] -= Integer.parseInt(st.nextToken());
        }

        for (int result : chess) {
            System.out.print(result + " ");
        }
    }
}