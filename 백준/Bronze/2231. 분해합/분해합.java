import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        int result = 0;
        
        for(int i = 0 ; i <= x; i++){
            int number = i;
            int sum = 0;
            
            while(number != 0){
                sum += number % 10;
                number /= 10;
            }
            
            if(sum + i == x) {
                result = i;
                break;
            }
        }
        
        System.out.println(result);
    }
}