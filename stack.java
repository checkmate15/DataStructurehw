package homeworkstf;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        Stack mystack = new Stack();

        // adding String and Integer
        mystack.add("adnan");
        mystack.add("is");
        mystack.add(23);
        mystack.add("years");
        mystack.add("old");


        // printing by Print statement
        System.out.println(mystack.get(0)+" "+mystack.get(1)+" "+mystack.get(2)+" "+mystack.get(3)+" "+mystack.get(4));
        System.out.println("----------------------------------------------------");

        //checking list size
        System.out.println("Stack list Size:  "+mystack.size());
        System.out.println("----------------------------------------------------");


    //search
        System.out.println(mystack.search("years"));



    }

}
