import java.io.*;
import java.util.*;

class Main {
     public static void main(String[] args) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuilder sb = new StringBuilder();
          StringTokenizer st;
          int sum = Integer.parseInt(br.readLine());
          int purchaseCnt = Integer.parseInt(br.readLine());
          int totalSum = 0;
          int price;
          int cnt;
          for (int i = 0; i < purchaseCnt; i++) {
               st = new StringTokenizer(br.readLine());
               price = Integer.parseInt(st.nextToken());
               cnt = Integer.parseInt(st.nextToken());

               totalSum += price * cnt;
          }

          if (sum == totalSum) {
             System.out.println("Yes");
          } else {
             System.out.println("No");
          }

     }
}