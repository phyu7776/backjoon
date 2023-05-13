import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> resultList = new ArrayList<>();
        String input = sc.nextLine();

        while(!input.equals("0")){
            StringBuffer sb = new StringBuffer(input);
            if(input.equals(sb.reverse().toString())){
                resultList.add("yes");
            }else{
                resultList.add("no");
            }
            input = sc.nextLine();
        }

        for(String result : resultList){
            System.out.println(result);
        }
    }
}