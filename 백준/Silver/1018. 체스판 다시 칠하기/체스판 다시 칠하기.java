import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[][] chess = new String[n][m];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                chess[i][j] = input[j];
            }
        }

        int minCnt = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int cnt = countChangedSquares(chess, i, j);
                minCnt = Math.min(minCnt, cnt);
            }
        }

        System.out.println(minCnt);
    }

    public static int countChangedSquares(String[][] chess, int startRow, int startCol) {
        int count = 0;
        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (!chess[i][j].equals("W")) {
                        count++;
                    }
                } else {
                    if (!chess[i][j].equals("B")) {
                        count++;
                    }
                }
            }
        }
        return Math.min(count, 64 - count);
    }
}
