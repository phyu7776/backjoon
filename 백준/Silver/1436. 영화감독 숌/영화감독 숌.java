import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int end = 666;

        int count = 1;
        while(count != x) {
            end++;
            if(String.valueOf(end).contains("666")) {
                count++;
            }
        }
        System.out.println(end);
    }
}