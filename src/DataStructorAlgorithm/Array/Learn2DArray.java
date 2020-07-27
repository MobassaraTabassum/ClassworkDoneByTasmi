package DataStructorAlgorithm.Array;


public class Learn2DArray {
    public static void main(String[] args) {
        String[][] studentInfo = new String[5][6];
        System.out.println("Length of the array : "+studentInfo.length);

       // 1st row:
        studentInfo[0][0]="stID";
        studentInfo[0][1]="firstname";
        studentInfo[0][2]="lastname";
        studentInfo[0][3]="address";
        studentInfo[0][4]="contactnumber";
        studentInfo[0][5]="SSN";

        //2nd row
        studentInfo[1][0]="st101";
        studentInfo[1][1]="james";
        studentInfo[1][2]="william";
        studentInfo[1][3]="ny,usa";
        studentInfo[1][4]="22324432";
        studentInfo[1][5]="2342323";

        //3rd row:

        studentInfo[1][0]="st102";
        studentInfo[2][1]="jack";
        studentInfo[2][2]="cohen";
        studentInfo[2][3]="jamaica,usa";
        studentInfo[2][4]="234345355";
        studentInfo[2][5]="53453434";

//4th row
        studentInfo[3][0]="st103";
        studentInfo[3][1]="rumi";
        studentInfo[3][2]="rumi1";
        studentInfo[3][3]="queens,usa";
        studentInfo[3][4]="231121";
        studentInfo[3][5]="121231232";
        //System.out.println(studentInfo[1][5]);

//        for (int i=0; i<studentInfo.length;i++){
//            for(int j=0;j<i;j++){
//            System.out.println(studentInfo[i]);
//        }}
        for (String  stinfo []: studentInfo) {
            for (String st: stinfo) {
                System.out.println(st);

            }
        }

        String [][] studentDetails={
                {"s1","name", "phonenumber", "address"},
                {"1", "xakerin", "12334113", "ny,usa"},
                {"2", "james", "224545", "fl, usa"}
        };
        System.out.println(studentDetails.length);
        System.out.println(studentDetails[2][2]);
//        for (String in[]:studentDetails) {
//            for (String st:student) {
//                System.out.println(st);
//
//            }
//        }

    }
}
