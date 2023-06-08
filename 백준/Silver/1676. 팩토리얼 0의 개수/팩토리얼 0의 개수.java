import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int count = 0;

        while (x >= 5) {
            count += x / 5;
            x /= 5;
        }

        System.out.println(count);
    }
}