import java.util.*;
import java.io.*;

class Main {
     public static void main(String[] args) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = null;
          StringBuilder sb = new StringBuilder();
          int a;
          int b;
          while (true) {
               st = new StringTokenizer(br.readLine()," ");
               a = Integer.parseInt(st.nextToken());
               b = Integer.parseInt(st.nextToken());

               if (a == 0 && b == 0) break;

               if (a > b) {
                  sb.append("Yes");
               } else {
                  sb.append("No");
               }

               sb.append("\n");
          }


          System.out.print(sb);
     }
}