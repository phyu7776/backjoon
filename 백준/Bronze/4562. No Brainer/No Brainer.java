import java.util.*;
import java.io.*;

class Main {
     public static void main(String[] args) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = null;
          StringBuilder sb = new StringBuilder();
          int t = Integer.parseInt(br.readLine());
          int a,b;
          for (int i = 0 ; i < t ; i ++ ){
               st = new StringTokenizer(br.readLine()," ");
               a = Integer.parseInt(st.nextToken());
               b = Integer.parseInt(st.nextToken());

               if (a < b) {
                    sb.append("NO BRAINS").append("\n");
               } else {
                    sb.append("MMM BRAINS").append("\n");
               }
          }

          System.out.print(sb);
     }
}