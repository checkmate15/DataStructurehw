package homeworkstf;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        //add one string
        ArrayList <String> oldarray = new ArrayList <String>();

        oldarray.add("kotai");
        oldarray.add("miah");

        //print little statement
        System.out.println("First try result "+"\n"+oldarray.get(0)+" "+oldarray.get(1)+"\n");

        System.out.println("----------------------------------------------------");




        ArrayList <String> myarray = new ArrayList <String>();
        ArrayList <Integer> myint = new ArrayList <Integer>();

        myint.add(21);
        myint.add(18);
        myint.add(20);
        myint.add(21);
        myint.add(37);


        System.out.println("Age = "+myint.get(0));
        System.out.println("----------------------------------------------------");




                myarray.add("Showrov");
                myarray.add("Nayem");
                myarray.add("Samian");
                myarray.add("A. opu");
                myarray.add("Aminur");
                System.out.println("Second try"+"\n"+"id"+"\t"+"Name"+"\t"+ "Age");


            //getting result by loop

        for (int i=0; i<1;i++){
            //System.out.println(i +"\t"+ myarray.get(i));
            for(int j=0; j<myint.size();j++){
                System.out.println(j +"\t"+ myarray.get(j)+"\t"+myint.get(j));



            }

        }

    }
}
