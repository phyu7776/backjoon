import java.util.*;
import java.io.*;

class Main{
    static LinkedList<Integer> stack = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < n; i++ ) {
            String[]input = br.readLine().split(" ");
            String command = input[0];

            if (command.equals("push")) {
                command = input[1];
                push(Integer.parseInt(command));
            } else if (command.equals("pop")) {
                sb.append(pop()).append("\n");
            } else if (command.equals("size")) {
                sb.append(size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(empty()).append("\n");
            } else if (command.equals("top")) {
                sb.append(top()).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void push(int x) {
        stack.add(x);
    }

    public static int pop() {
        int x = 0;
        if (stack.size() > 0){
            x = stack.removeLast();
        } else {
            x = -1;
        }
        return x;
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        int x = -1;
        if (stack.size() <= 0) {
            x = 1;
        } else {
            x = 0;
        }
        return x;
    }

    public static int top() {
        int x = -1;
        if (stack.size() <= 0) {
            x = -1;
        } else {
            x = stack.get(stack.size() - 1);
        }
        return x;
    }

}