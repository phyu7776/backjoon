import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> inputMap = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()) {
            String input =st.nextToken();
            if (!inputMap.containsKey(input)) {
                inputMap.put(input, 1);
            } else {
                inputMap.put(input, inputMap.get(input) + 1 );
            }
        }


        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()) {
            String input =st.nextToken();
            if (inputMap.containsKey(input)) {
                sb.append(inputMap.get(input)).append(" ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}