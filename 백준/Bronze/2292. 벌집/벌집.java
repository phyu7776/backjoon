import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        int space = 1;
        int i = 0;
		
		while(true){
			space+=6*i;
			i++;
			if(space>=x) {
                System.out.println(i);
                break;
            }
		}
    }
}