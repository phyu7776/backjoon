import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t ; i++ ){
            String input = br.readLine();
            sb.append(compareInput(input) + "\n");
        }

        System.out.print(sb);
    }

    public static String compareInput (String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < input.length(); i++ ) {
            char alpha = input.charAt(i);

            if (alpha == '(') {
                stack.push(alpha);
            } else if(alpha == ')') {
                if (stack.isEmpty() || !stack.peek().equals('(')) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        } else {
            return "YES";
        }
    }
}