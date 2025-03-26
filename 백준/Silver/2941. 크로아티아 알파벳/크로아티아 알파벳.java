import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String[] croatiaAlphabets = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (String croatia : croatiaAlphabets) {
            word = word.replaceAll(croatia, "X");
        }

        System.out.println(word.length());
    }
}