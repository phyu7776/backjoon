import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < T; i++){
            int floor = sc.nextInt();
            int roomNum = sc.nextInt();

            sb.append(getPeople(floor, roomNum) + "\n");
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