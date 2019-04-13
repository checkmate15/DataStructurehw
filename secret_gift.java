package homeworkstf;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;



public class secret_gift {
    public static void main (String [] args){

            Random roll= new Random();
            Scanner t = new Scanner(System.in);


            ArrayList <String> familymembers = new ArrayList <String>();

            System.out.println("Type your family member name, Put 10 persons name: ");
            String name = t.nextLine();
            familymembers.add(name);
            while (familymembers.size()!=10){
                name=t.nextLine();
                familymembers.add(name);
            }
            System.out.println("Your family’r member are = "+ familymembers);

            System.out.println("For who you want to check secret gift: ");
            String nameremove = t.nextLine();



            familymembers.remove(nameremove);
// (this line is for my checking purpose)
           // System.out.println("other family members: "+ familymembers);

            int winner = roll.nextInt(familymembers.size());
            String wname = familymembers.get(winner);


            System.out.println(nameremove+", your secret Gift will be given by  "+ wname);








        }

    }
