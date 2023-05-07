import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int t = sc.nextInt();
        int[][] arr = new int[t][3];
        for(int i = 0 ; i < t; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();

        }

        for(int i = 0 ; i < t; i++) {
            int h = arr[i][0];
            int n = arr[i][2];
            if(n % h == 0){
                System.out.println(h*100 + n/h);
            }else{
                System.out.println((n % h * 100) + (n/h + 1));
            }
        }
    }
}