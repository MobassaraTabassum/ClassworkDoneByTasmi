package DataStructorAlgorithm.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {
    public static void main(String[] args) {
        List <String> stateOfUSA= new ArrayList<>();
        stateOfUSA.add("NY");
        stateOfUSA.add("NJ");
        stateOfUSA.add("FL");
        stateOfUSA.add("TX");
        stateOfUSA.add("CT");

        List<String> stateofCanada= new ArrayList<>();

        stateofCanada.add("ON");
        stateofCanada.add("QC");
        stateofCanada.add("BC");
        stateofCanada.add("SK");
        stateofCanada.add("MB");
        List<String> stateOfUK= new ArrayList<>();

        stateOfUK.add("London");
        stateOfUK.add("Scotland");
        stateOfUK.add("Bristol");
        stateOfUK.add("Wales");
        stateOfUK.add("Mekelle");


        Map<String , List<String>> stMap= new HashMap<>();
        stMap.put("USA", stateOfUSA);
        stMap.put("CANADA", stateofCanada);
        stMap.put("UK", stateOfUK);
        //System.out.println(stMap);
        for (Map.Entry<String, List<String>> entry:stMap.entrySet()        ) {
            System.out.println(entry);
            //System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

    }
}
