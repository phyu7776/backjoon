import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = 31;
        long m = 1234567891;

        int l = sc.nextInt();
        sc.nextLine();
        String alpha = sc.nextLine();
        alpha = alpha.toLowerCase();
        long result = 0;
        for(int i = 0 ; i < alpha.length() ; i++){
            int x = (int)alpha.charAt(i)-96;

            result += ( (x%m) * (Math.pow(r,i)%m) ) % m;
        }

        System.out.println(result);
    }
}