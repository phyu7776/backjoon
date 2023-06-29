import java.io.*;
import java.util.*;

class Main {
     public static void main(String[] args) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          StringBuilder sb = new StringBuilder();

          int n = Integer.parseInt(st.nextToken());
          int t = Integer.parseInt(st.nextToken());
          HashMap<String, String> poketmon = new HashMap<>();
          HashMap<String, String> reversePoketmon = new HashMap<>();
          String num;
          String name;
          for (int i = 1 ; i <= n ; i++) {
               num = String.valueOf(i);
               name = br.readLine();
               poketmon.put(num,name);
               reversePoketmon.put(name,num);
          }

          for (int i = 0 ; i < t ; i++) {
               String input = br.readLine();
               if (isInteger(input)) {
                    sb.append(poketmon.get(input)).append("\n");
               } else {
                    sb.append(reversePoketmon.get(input)).append("\n");
               }
          }

          System.out.print(sb);

     }

     public static boolean isInteger (String input) {
          try {
            Integer.parseInt(input);
            return true;
          } catch (Exception e) {
            return false;
          }
     }
}