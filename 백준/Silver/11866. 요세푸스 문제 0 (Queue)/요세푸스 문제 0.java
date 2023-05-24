import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()) - 1;


        for (int i = 1 ; i <= n ; i++) {
            queue.offer(i);
        }

        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 0 ; i < k ; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll());
            if (queue.size() <= 0) {
                sb.append(">");
            } else {
                sb.append(", ");
            }
        }

        System.out.println(sb);
    }
}