import java.util.*;

class Main{
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //주어진 카드의 갯수
        int m = sc.nextInt(); //정해진 최대의 수

        int[] cards = new int[n]; //주어진 카드
        boolean[] isUsed = new boolean[n];
        List<Integer> selected = new ArrayList<>(3);


        for(int i = 0 ; i < cards.length ; i++){
            cards[i] = sc.nextInt();
        }


        backtracking(m, cards, isUsed, selected);
        System.out.println(result);
    }

    public static void backtracking(int m, int[] cards,boolean[] isUsed, List<Integer> selected){

        if(selected.size() == 3){
            int sum = 0;
            for(int x : selected){
                sum += x;
            }
            if(sum >= result && sum <= m){
                result = sum;
            }
            return;
        }

        for (int i = 0 ; i < cards.length ; i++){
            if(!isUsed[i]){
                isUsed[i] = true;
                selected.add(cards[i]);
                backtracking(m, cards, isUsed, selected);
                isUsed[i] = false;
                selected.remove(selected.size() - 1);
            }
        }
    }
}