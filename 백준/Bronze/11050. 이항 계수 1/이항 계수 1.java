import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(bionomialCoefficient(n,k));
    }

    public static long bionomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k) );
    }

    public static int factorial(int x) {
        if( x == 0){
            return 1;
        }
        if( x <= 1 ){
            return x;
        }else{
            return factorial(x - 1) * x;
        }
    }
}