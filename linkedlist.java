package homeworkstf;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList mylist = new LinkedList();

        //adding String

        mylist.add("Adnan");
        mylist.add("A. Opu");
        mylist.add("Samian");
        mylist.add("Nayem");
        mylist.add("Showrov");
        mylist.add("Aminur");

        //adding integer
        LinkedList myint = new LinkedList();
        myint.add(300);
        myint.add(320);
        myint.add(390);
        myint.add(400);
        myint.add(410);
        myint.add(400);
        //we don't need to declare String or Integer


        //getting result by print statement

        System.out.println("Checking my whole Linked list = "+mylist);
        System.out.println("Checking value for 2 =  "+ mylist.get(2));
        System.out.println("----------------------------------------------------");



        //loop try

        System.out.println("checking whole Linked list with loop: ");

        System.out.println("Id "+" Name "+" Salary");
        for(int x=0; x<1;x++){
            for(int y =0; y<myint.size();y++){
                System.out.println(y+"\t"+mylist.get(y)+"\t"+ myint.get(y) );


            }

        }
    }
}
