import java.util.*;

public class Main {

    static int[][] result =new int[41][2];

    public static void main(String[] args) {

        result[0][0] = 1;
        result[0][1] = 0;
        result[1][0] = 0;
        result[1][1] = 1;

        for(int i = 2; i < 41; i++) {
            result[i][0]=result[i-1][0]+result[i-2][0];
            result[i][1]=result[i-1][1]+result[i-2][1];
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0 ;i < t ;i++) {
            int x = sc.nextInt();
            System.out.println(result[x][0]+" "+result[x][1]);
        }
    }
}
