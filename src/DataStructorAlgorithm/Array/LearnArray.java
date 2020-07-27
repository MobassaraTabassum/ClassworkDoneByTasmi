package DataStructorAlgorithm.Array;


import jdk.swing.interop.SwingInterOpUtils;

public class LearnArray {
    public static void main(String[] args) {


        //String name= "james";
        //variable can hold one value at a time but array can hold multiple value at a time

        String[] name;

        String[] StudentName = {"tasmi", "resma", "Yeasmin", "shova"};
//        System.out.println("student name :" + StudentName[0]);
//        System.out.println("student name :" + StudentName[1]);
//        System.out.println("student name :" + StudentName[2]);
//        //two way to print the 3rd array
//        System.out.println("student name :" + StudentName[3]);
//
//        System.out.println("student name :" + StudentName[0 + 3]);
//        System.out.println("Length of the array: " + StudentName.length);

        try {
            System.out.println(StudentName[4]);
        } catch (Exception e) {
            System.out.println("array index out of bound exception");

        }
        for (int i = 0; i < StudentName.length; i++) {
            System.out.println("student name " + StudentName[i]);

        }
        //System.out.println("to get the value using for each loop..............");
        //for each loop
        //for (type variable: arrayName){
        //}

//        for (String st:StudentName) {
//            System.out.println("studnet name :" +st);
//        }


        //to validate shuvo exist or not

        for (int i = 0; i < StudentName.length; i++) {
            if (StudentName[i] == "tasmi") {
                System.out.println("stident name is tasmi: " + StudentName[i]);

            }

        }
        //declare array with length

        String [] stStudentAddress= new String[6];
        System.out.println(stStudentAddress.length);
        stStudentAddress[0]="NY, USA";
        stStudentAddress[1]="NJ, USA";
        stStudentAddress[2]="FL, USA";
        stStudentAddress[3]="VA, USA";
        stStudentAddress[4]="TX, USA";
        stStudentAddress[5]="WA, USA";
        //stStudentAddress[6]="CT, USA";
        System.out.println(stStudentAddress[4]);
        for (String ad:stStudentAddress) {
            System.out.println(ad);

        }



    }
}
