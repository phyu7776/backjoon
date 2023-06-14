import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Long> cable = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < k; i++) {
            cable.add(Long.parseLong(br.readLine()));
        }

        long maxLength = Collections.max(cable) + 1;
        long start = 0;
        long mid = 0;

        while (start < maxLength) {
            mid= (start + maxLength) / 2;
            long count = 0;

            for (int i = 0 ; i < cable.size(); i++) {
                count += (cable.get(i)/mid);
            }

            if(count < n) {
                maxLength = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start - 1);
    }
}
