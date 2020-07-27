package DataStructorAlgorithm.Array;

public class Learn3DArray {
    //3D Arrat : 1D+2D [][][]

    //datatype [size][row][column] arrayName =  new dataType[sizeLength][RowLength][ColumnLength]

    //declare with Length

    static String[][][] pizza = new String[4][5][5];
    static String[][][] pizza1 = new String[4][5][5];

    public static void main(String[] args) {

        Learn3DArray learn3DArray = new Learn3DArray();
        learn3DArray.pizza[0][0][0] = "s1";
        pizza[0][0][0] = "serial";
        pizza[0][0][1] = "pizza Type";
        pizza[0][0][2] = "price";
        pizza[0][0][3] = "quantity";
        pizza[0][0][4] = "amount";

        pizza[0][1][0] = "1";
        pizza[0][1][1] = "Meat";
        pizza[0][1][2] = "30";
        pizza[0][1][3] = "3";
        pizza[0][1][4] = "90";

        pizza[0][2][0] = "2";
        pizza[0][2][1] = " fatPizza";
        pizza[0][2][2] = "21";
        pizza[0][2][3] = "2";
        pizza[0][2][4] = "30";
        System.out.println(pizza[0][2][3]);

        for (String pizzaInfo[][]:pizza) {
            for (String pizzaIn[]:pizzaInfo) {
                for(String pi:pizzaIn){
                    System.out.println("pizza valu"+pi);
                }


            }

        }











    }


}
