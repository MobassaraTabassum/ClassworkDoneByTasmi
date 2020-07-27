package DataStructorAlgorithm.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<String> foodName = new HashSet<>();
        foodName.add("pizza");
        foodName.add("coffee");
        foodName.add("burger");
        foodName.add("burger");

        foodName.add("steak");
        foodName.add("steak");
        System.out.println(foodName);

        foodName.remove("coffee");
        System.out.println(foodName.contains("burger"));



    }
}
