import java.util.*;
import java.io.*;

public class Main {

    static boolean[] visit;
    static int[][] node;
    static int computer, nodeCount, infectionCnt;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        computer = Integer.parseInt(br.readLine());
        nodeCount = Integer.parseInt(br.readLine());

        visit = new boolean[computer + 1];
        node = new int[computer + 1][computer + 1];

        for (int i = 0; i < nodeCount; i++) {
            String[] connetNode = br.readLine().split(" ");
            int a = Integer.parseInt(connetNode[0]);
            int b = Integer.parseInt(connetNode[1]);

            node[a][b] = node[b][a] = 1;
        }

        dfs(1);

        System.out.println(infectionCnt);
    }

    public static void dfs(int start) {

        visit[start] = true;

        for (int i = 1; i <= computer; i++) {
            if (node[start][i] == 1 && !visit[i]) {
                infectionCnt++;
                visit[i] = true;
                dfs(i);
            }
        }
    }
}