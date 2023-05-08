import java.util.*;
    
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
                int x = sc.nextInt();
        int[] arr = new int[x];
        int result = 0;
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < x; i++) {
            if (arr[i] > 1 && isPrimeNumber(arr[i])) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static boolean isPrimeNumber(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}