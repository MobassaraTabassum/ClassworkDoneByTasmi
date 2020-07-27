package DataStructorAlgorithm.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

    static ArrayList<String> stName = new ArrayList<String>();

    String[] studentAddress = new String[5];

    public static void main(String[] args) {

        stName.add("rabah");
        stName.add("yeti");
        stName.add("tasmi");
        stName.add("davis");
        stName.add("shakir");
        System.out.println("student name:" + stName);

        for (String st : stName) {
            System.out.println("student name is " + st);
            stName.remove(3);
        }
    }
}
