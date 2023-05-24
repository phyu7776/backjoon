import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()) - 1;

        List<Integer> numbers = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++) {
            numbers.add(i);
        }

        sb.append("<");
        int cnt = k;
        while (!numbers.isEmpty()) {
            sb.append(numbers.get(cnt));
            numbers.remove(cnt);
            if(numbers.size() == 0){
                System.out.println(sb + ">");
                break;
            } else {
                sb.append(", ");
            }
            cnt = (cnt+k) % numbers.size();
        }
    }
}