package DataStructorAlgorithm.queue;

import java.util.PriorityQueue;
import java.util.jar.JarOutputStream;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(70);
        pq.add(80);
       // System.out.println(pq);
        System.out.println(pq.peek());
        for (Integer in:pq) {
            System.out.println(in);

        }
        System.out.println(pq.poll());
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        for (Integer in:pq) {
            System.out.println(in);

        }
        System.out.println(pq.peek());


    }
}
