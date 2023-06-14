import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < t; i++){
            int floor = Integer.parseInt(br.readLine());
            int roomNum = Integer.parseInt(br.readLine());
            sb.append(getPeople(floor, roomNum)).append("\n");
        }

        System.out.println(sb);
    }

    public static int getPeople(int floor, int roomNum){
        if(roomNum == 0){
            return 0;
        }else if(floor == 0){
            return roomNum;
        }else{
            return getPeople(floor , roomNum -1) + getPeople(floor -1 , roomNum);
        }
    }
}