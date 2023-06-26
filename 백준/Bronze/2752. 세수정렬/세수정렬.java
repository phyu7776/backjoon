import java.util.*;
import java.io.*;

class Main{
     public static void main(String[] args) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());

          ArrayList<Integer> list = new ArrayList<>();
          while (st.hasMoreTokens()) {
               list.add(Integer.parseInt(st.nextToken()));
          }
          Collections.sort(list);

          for (int x : list) {
              System.out.print(x + " ");
          }
     }
}