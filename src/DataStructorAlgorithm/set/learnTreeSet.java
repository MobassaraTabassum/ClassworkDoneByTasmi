package DataStructorAlgorithm.set;

import java.util.TreeSet;

public class learnTreeSet {


    public static void main(String[] args) {
        TreeSet<String > tr= new TreeSet<>();
        tr.add("fat Pizza");
        tr.add("coffee");
        tr.add("burger");
        tr.add("burger");
        tr.add("steak");
        System.out.println(tr);
        System.out.println(tr.contains("burger1"));
        System.out.println(tr.first());


    }
}
