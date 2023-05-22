import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new String[]{st.nextToken(), st.nextToken()});
        }

        Collections.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int a = Integer.parseInt(o1[0]);
                int b = Integer.parseInt(o2[0]);
                if(a == b){
                    return 0;
                } else {
                    return Integer.compare(a, b);
                }
            }
        });

        for(String[] member : list){
            System.out.println(member[0] + " " + member[1]);
        }
    }
}