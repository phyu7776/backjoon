import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        for (int i = 0 ; i < 3 ; i++) {
            String input = sc.nextLine();

            if (!input.contains("Fizz") && !input.contains("Buzz")) {
                num = Integer.parseInt(input);
            }
            
            num++;
        }

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
