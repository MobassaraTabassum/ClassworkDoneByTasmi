package DataStructorAlgorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    //fifo order: first in first out
    public static void main(String[] args) {
        Queue<String> foodMenu = new LinkedList<>();
        foodMenu.add("pizza");//head
        foodMenu.add("coffee");
        foodMenu.add("steak");
        foodMenu.add("biriyani");
        foodMenu.add("bubble tea");//tail
        System.out.println(foodMenu);

//retrieve value in for each loop
        for (String fm : foodMenu) {
            System.out.println(fm);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        foodMenu.remove("steak");
        System.out.println(foodMenu);

        System.out.println("**************** Methods used with queue*****************");

        System.out.println(foodMenu.element());//first in
        System.out.println(foodMenu.poll());//first out
        System.out.println(foodMenu.element());
        System.out.println(foodMenu.remove());
        System.out.println(foodMenu.element());
        System.out.println(foodMenu.size());






    }
}
