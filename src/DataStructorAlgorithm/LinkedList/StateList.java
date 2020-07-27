package DataStructorAlgorithm.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList {


    public static void main(String[] args) {
        List<String> stateList= new LinkedList<>();

        stateList.add("NY");
        stateList.add("NJ");
        stateList.add("FL");
        stateList.add("CT");
        stateList.add("VA");
        stateList.add("WA");

        Iterator it= stateList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());

        }
            stateList.remove(2);


        Iterator it1= stateList.iterator();

            while(it.hasNext()){
                System.out.println(it.next());
            }








    }
}



