import java.io.*;
import java.util.*;

public class Main {

    static boolean[][] visited;
    static int[][] home;
    static int line;
    static int homeNumber;
    static int[] dirY = { 1, -1, 0, 0 };
    static int[] dirX = { 0, 0, 1, -1 };

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        line = Integer.parseInt(br.readLine());

        home = new int[line][line];
        visited = new boolean[line][line];

        for (int i = 0; i < line; i++) {
            home[i] = Arrays.stream(br.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        List<Integer> homeCount = new ArrayList<>();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if (home[i][j] == 1 && !visited[i][j]) {
                    homeNumber = 0;
                    dfs(i, j);
                    homeCount.add(homeNumber);
                }
            }
        }

        // 출력
        System.out.println(homeCount.size());
        Collections.sort(homeCount);
        for (int count : homeCount) {
            System.out.println(count);
        }
    }

    public static void dfs(int y, int x) {
        visited[y][x] = true;
        homeNumber++;

        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            // 배열 범위 체크
            if (newY >= 0 && newY < line && newX >= 0 && newX < line) {
                if (!visited[newY][newX] && home[newY][newX] == 1) {
                    dfs(newY, newX);
                }
            }
        }
    }
}
