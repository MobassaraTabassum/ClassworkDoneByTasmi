package DataStructorAlgorithm.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifference {
    public static void main(String[] args) {


        int[] num1 = {1, 4, 6, 7, 8, 9};

        int[] num2 = {2, 2, 3, 5, 8, 10};

        Set<Integer> number1 = new HashSet<Integer>();
        number1.addAll(Arrays.asList(new Integer[]{1, 4, 6, 7, 8, 9}));

        Set<Integer> number2 = new HashSet<Integer>();
        number2.addAll(Arrays.asList(new Integer[]{2, 2, 3, 5, 8, 10}));

        //to do union set

        Set<Integer> union = new HashSet<>(number1);
        union.addAll(number2);

        System.out.println(union);


//to find intersaction
        Set<Integer> intersaction = new HashSet<>(number1);
        intersaction.retainAll(number2);
        System.out.println(intersaction);

        //to find symmetric differece:
        Set<Integer> difference = new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println(difference);


    }

}
