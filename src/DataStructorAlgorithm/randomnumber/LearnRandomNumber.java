package DataStructorAlgorithm.randomnumber;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {
        int []stId= new int[10];

        Random random=new Random();
        for (int i=0; i<stId.length; i++){


            stId[i]=random.nextInt(20);
            if(stId[i]==stId[i]){
                System.out.println("hello");
            }
//            else{
//                System.out.println(stId[i]);
//
//            }
        }
        //System.out.println(Math.random());






    }
}
