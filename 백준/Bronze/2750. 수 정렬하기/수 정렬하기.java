import java.io.*;
import java.util.*;

class Main{
     public static void main(String[] args) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          int n = Integer.parseInt(br.readLine());
          Set<Integer> inputSet = new HashSet<>();
          for (int i = 0; i < n; i++) {
               inputSet.add(Integer.parseInt(br.readLine()));
          }

          ArrayList<Integer> list = new ArrayList<>(inputSet);

          Collections.sort(list, new Comparator<Integer>() {
               @Override
               public int compare(Integer a, Integer b) {
                    return a - b;
               }
          });

          for (int x : list) {
              System.out.println(x);
          }
     }
}