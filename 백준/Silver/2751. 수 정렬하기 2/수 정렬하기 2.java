import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//머임 깃 왜안올라감 ?

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x =  Integer.parseInt(br.readLine());

        ArrayList<Integer> xList = new ArrayList<>();

        for(int i = 0 ; i < x ; i++){
            xList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(xList);

        for (int num : xList){
            sb.append(num + "\n");
        }

        System.out.println(sb);
    }
}