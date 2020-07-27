package DataStructorAlgorithm.stack;
import java.util.Stack;
public class LearnStack {
    //LIFO: last in first out
    public static void main(String[] args) {
        Stack<String> foodMenu = new Stack<>();
        foodMenu.add("pizza");//head
        foodMenu.add("coffee");
        foodMenu.add("steak");
        foodMenu.add("biriyani");
        foodMenu.add("bubble tea");//tail
        System.out.println(foodMenu);
        foodMenu.pop();
        System.out.println(foodMenu);
        foodMenu.push("love");
        System.out.println(foodMenu);

        Stack<Integer> foodPrice= new Stack<>();
        foodPrice.push(20);
        foodPrice.push(30);
        foodPrice.push(40);
        foodPrice.push(50);
        foodPrice.push(60);
        //System.out.println(foodPrice);

        stackSearch(foodPrice, 45);



    }
    static void stackSearch(Stack<Integer> stack, int element){
        Integer pos= stack.search(element);
        if( pos==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element  found");

        }
    }
}
