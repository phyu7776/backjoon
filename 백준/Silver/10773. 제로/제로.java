import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        
        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0 ; i < k ; i++ ) {
            int input = Integer.parseInt(br.readLine());
            
            if (!stack.isEmpty() && input == 0 ) {
                sum -= stack.pop();
            } else {
                stack.push(input);
                sum += input;
            }
        }
        System.out.println(sum);
    }
}