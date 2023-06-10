import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int x = Integer.parseInt(br.readLine());
        LinkedList<int[]> orderList = new LinkedList<>();

        for (int i = 0; i < x; i ++ ){
            orderList.clear();
            st = new StringTokenizer(br.readLine());
            int last = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < last ; j++) {
                orderList.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            sb.append(getIndexOrder(index, orderList)).append("\n");
        }

        System.out.println(sb);
    }

    public static int getIndexOrder (int index, LinkedList<int[]> orderList) {
        int count = 0;
        int select = orderList.get(index)[0];
        while (!orderList.isEmpty()) {
            int max = orderList.stream().mapToInt(arr -> arr[1]).max().orElse(0);
            int[] getOrder = orderList.remove();
            if (getOrder[1] < max){
                orderList.add(getOrder);
            } else {
                if (select != getOrder[0]) {
                    count++;
                } else {
                    return ++count;
                }
            }
        }

        return 0;
    }
}