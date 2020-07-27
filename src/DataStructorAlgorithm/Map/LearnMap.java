package DataStructorAlgorithm.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, String> stateMap= new HashMap<>();
        stateMap.put("USA", "WDC");
        stateMap.put("Canada", "Ottawa");
        stateMap.put("Bangladesh", "Dhaka");
        stateMap.put("Bangladesh", "love");
        stateMap.put("Yemen", "Sana");
        stateMap.put("NZ", "Auckland");

        for (Map.Entry <String, String> entry : stateMap.entrySet()) {
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }

        Map<String, Integer> pizzaTypeWithPrice= new HashMap<>();

        pizzaTypeWithPrice.put("fat Pizza", 50);
        pizzaTypeWithPrice.put("Cheese Pizza", 40);
        pizzaTypeWithPrice.put("Spicy Pizza", 60);
        pizzaTypeWithPrice.put("chicken Pizza", 70);

        for(Map.Entry<String, Integer> pizza: pizzaTypeWithPrice.entrySet() ){
            System.out.println(pizza);
            //System.out.println();
        }
        for (String st: pizzaTypeWithPrice.keySet()        ) {
            //System.out.println(st+" : "+ pizzaTypeWithPrice.get(st));
            System.out.println(st);

        }


    }
}
