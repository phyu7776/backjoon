import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<int[]> array = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }


        for(int i = 0 ; i < array.size(); i++){
            int rank = 1;
            for (int j = 0 ; j < array.size(); j++){
                if(i == j){
                    continue;
                }

                if (array.get(i)[0] < array.get(j)[0] && array.get(i)[1] < array.get(j)[1]) {
                    rank++;
                }
            }
            System.out.println(rank);
        }
    }
}