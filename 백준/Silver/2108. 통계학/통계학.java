import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> inputList = new ArrayList<>();
        for (int i = 0 ; i < n; i ++ ) {
            inputList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(inputList);

        double sum = inputList.stream().mapToDouble(input -> input).sum();

        sb.append(Math.round(sum/n)).append("\n");
        sb.append(inputList.get(n/2)).append("\n");
        sb.append(mostFrequent(inputList)).append("\n");
        sb.append((inputList.get(inputList.size() - 1)) - (inputList.get(0))).append("\n");

        System.out.println(sb);
    }

    public static int mostFrequent(ArrayList<Integer> inputList) {
        HashMap<Integer, Integer> inputMap = new HashMap<>();

        for (int i = 0; i < inputList.size(); i++) {
            int input = inputList.get(i);
            inputMap.put(input, inputMap.getOrDefault(input, 0)+1);
        }

        int max = Collections.max(inputMap.values());

        Iterator<Map.Entry<Integer, Integer>> iterator = inputMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() != max) {
                iterator.remove();
            }
        }

        ArrayList<Integer> tempList = new ArrayList<>(inputMap.keySet());
        Collections.sort(tempList);
        if (inputMap.size() > 1) {
          return tempList.get(1);
        } else {
          return tempList.get(0);
        }
    }

}