import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while (true) {
            str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            sb.append(strCompare(str) + "\n");
        }
        System.out.println(sb);
    }

    public static String strCompare (String str) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++ ){
            char character = str.charAt(i);

            if ( character == ('[') || character == ('(') ) {
                stack.push(character);
            } else if(character == (']')){
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if(character == (')')){
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}