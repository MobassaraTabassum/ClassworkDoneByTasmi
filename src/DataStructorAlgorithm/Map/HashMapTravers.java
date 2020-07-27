package DataStructorAlgorithm.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTravers {
    public static void main(String[] args) {
        int[] number = {40, 30, 56, 78, 43, 33,30,78, 66};
        printFrequency(number);

    }
    static void printFrequency(int arr[]) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer c = numMap.get(arr[i]);

            if (numMap.get(arr[i]) == null) {
                numMap.put(arr[i],1);
            }
            else {
                numMap.put(arr[i], ++c);
            }
        }



        for (Map.Entry map: numMap.entrySet()){
            System.out.println(map);
           // System.out.println("frequency of "+ map.getKey()+ ": "+ map.getValue());
        }

    }
}

