import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int person = sc.nextInt();
        sc.nextLine();
        String[] shirts = sc.nextLine().split(" ");
        String[] groups = sc.nextLine().split(" ");

        int t = Integer.parseInt(groups[0]);
        int p = Integer.parseInt(groups[1]);

        calcShirt(shirts, t);
        calcPen(person, p);

    }

    public static void calcShirt(String[] shorts, int t) {
        int result = 0;

        for (String shirts : shorts) {
            int needShirt = Integer.parseInt(shirts);

            result += needShirt/t;
            if (needShirt % t != 0) {
                result++;
            }
        }

        System.out.println(result);

    }

    public static void calcPen(int person, int p) {
        System.out.print(person/p);
        System.out.print(" ");
        System.out.print(person%p);
    }
}
