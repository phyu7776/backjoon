import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());

         int colume = Integer.parseInt(st.nextToken());
         int row = Integer.parseInt(st.nextToken());
         int etyColume = Integer.parseInt(st.nextToken());
         int etyRow = Integer.parseInt(st.nextToken());

         int existColume = (colume - 1) / (etyColume + 1);
         int existRow = (row - 1) / (etyRow + 1);

         System.out.println((existColume + 1) * (existRow + 1));
    }
}