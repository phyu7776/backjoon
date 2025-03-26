import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[] alpha = new char[26];
		int[][] chk = new int[2][26];
		int max = 0;
		char answer = 0;
		int count = 0;
		String sameFl = "N";
		
		for(int i=0;i<alpha.length;i++) {
			alpha[i] = (char)(i+97);
		}
		for (int i = 0; i < chk[0].length; i++) {
			chk[0][i] = i;
		}
		
		String a = input.next();
		a = a.toLowerCase();
		
		for (int i = 0; i < alpha.length; i++) {
			for (int j = 0; j < a.length(); j++) {
				if(alpha[i] == a.charAt(j)) {
					chk[1][i] = chk[1][i]+1;
				}
			}
		}
		
//		for (int i = 0; i < alpha.length; i++) {
//			System.out.print(alpha[i] + "\t");
//		}
//		for (int i = 0; i < chk.length; i++) {
//			System.out.println();
//			for (int j = 0; j < chk[i].length; j++) {
//				System.out.print(chk[i][j] + "\t");
//			}
//		}
//		System.out.println();
		for (int i = 0; i < chk[0].length; i++) {
			if(max < chk[1][i]) {
				max = chk[1][i];
			}
		}
		for (int i = 0; i < chk[0].length; i++) {
			if(max == chk[1][i]) {
				count++;
			}
		}
		if(count > 1) {
			sameFl = "Y";
		}
		
		for (int i = 0; i < chk[0].length; i++) {
			if(max == chk[1][i]) {
				answer = alpha[i];
			}
		}
		if(sameFl.equals("N")) {
			System.out.println(Character.toUpperCase(answer));
		}else {
			System.out.println("?");
		}
	}
}