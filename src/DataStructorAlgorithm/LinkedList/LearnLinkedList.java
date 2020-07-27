package DataStructorAlgorithm.LinkedList;

import java.util.*;

public class LearnLinkedList {


    public static void main(String[] args) {
        List<String> mobileBrands = new LinkedList<String>();
        mobileBrands.add("apple");
        mobileBrands.add("samsung");
        mobileBrands.add("lg");
        mobileBrands.add("nokia");
        mobileBrands.add("sony");
        mobileBrands.add("Google");

        System.out.println(mobileBrands.size());
        for (String mb : mobileBrands) {
            System.out.println(mb);

        }

    }

}