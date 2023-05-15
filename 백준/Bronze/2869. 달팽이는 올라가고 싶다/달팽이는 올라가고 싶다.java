import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //낮에 올라가는 거리
        int b = sc.nextInt(); //밤에 미끄러지는 거리
        int v = sc.nextInt(); //총 올라가야하는 거리

        int result = (v - b) / (a - b);

        if(((v - b) % (a - b) != 0)){
            result ++;
        }

        System.out.println(result);
    }

}