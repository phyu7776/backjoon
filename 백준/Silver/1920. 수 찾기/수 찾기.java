import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] aArray = new int[a];

        String[] aStrArray = br.readLine().split(" ");
        for(int i = 0 ; i < aArray.length ; i++ )  {
            aArray[i] = Integer.parseInt(aStrArray[i]);
        }
        Arrays.sort(aArray);

        int m = Integer.parseInt(br.readLine());
        int[] mArray = new int[m];

        String[] mStrArray = br.readLine().split(" ");
        for(int i = 0 ; i < mArray.length ; i++ )  {
            mArray[i] = Integer.parseInt(mStrArray[i]);
        }

        int[] resultArr = new int[m];
        for(int i = 0 ; i < mArray.length ; i++ )  {
            if(Arrays.binarySearch(aArray, mArray[i]) >= 0) {
                resultArr[i] = 1;
            }else{
                resultArr[i] = 0;
            }
        }

        for (int result : resultArr) {
            System.out.println(result);
        }
    }
}