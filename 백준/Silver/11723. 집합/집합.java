import java.io.*;
import java.util.*;

class Main {
     static int arr = 0;
     static StringBuilder sb = new StringBuilder();
     public static void main(String[] args) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st;
          int t = Integer.parseInt(br.readLine());
          String command;
          int x = 0;

          for (int i = 0 ; i < t ; i++ ) {
               st = new StringTokenizer(br.readLine()," ");
               command = st.nextToken();

               if (st.hasMoreTokens()) {
                  x = Integer.parseInt(st.nextToken());
               }

               switch (command) {
                    case "add" : add(x);
                         break;
                    case "remove" : remove(x);
                         break;
                    case "check" : check(x);
                         break;
                    case "toggle" : toggle(x);
                         break;
                    case "all" : all();
                         break;
                    case "empty" : empty();
                         break;
               }

          }

          System.out.println(sb);
     }

     public static void add (int x) {
          arr |= (1 << x);
     }

     public static void remove (int x) {
          arr &= ~(1 << x);
     }

     public static void check (int x) {
          sb.append((arr & (1 << x)) == 0 ? 0 : 1).append("\n");
     }

     public static void toggle (int x) {
          arr ^= (1 << x);
     }

     public static void all () {
          arr = (1 << 21) - 1;
     }

     public static void empty () {
          arr = 0;
     }

}