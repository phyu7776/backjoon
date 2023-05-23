import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<int[]> positions = new ArrayList<>();

        for (int i = 0 ; i < n ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            positions.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        Collections.sort(positions, new Comparator<int[]>() {
           @Override
           public int compare(int[] a, int[] b) {
               int a1 = a[0];
               int a2 = a[1];
               int b1 = b[0];
               int b2 = b[1];

               if (a2 == b2) {
                   return Integer.compare(a1,b1);
               } else {
                   return Integer.compare(a2,b2);
               }
           }
        });

        for ( int[] position : positions ) {
            System.out.println(position[0] + " " + position[1]);
        }
    }
}