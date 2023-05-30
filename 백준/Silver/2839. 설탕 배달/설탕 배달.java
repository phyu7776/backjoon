import java.io.*;

class Main{
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true) {
            if (n % 5 == 0) {
                cnt += n / 5;
                break;
            } else {
                n -= 3;
                cnt ++;
            }

            if( n < 0) {
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}