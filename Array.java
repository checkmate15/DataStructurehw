package homeworkstf;

public class Array {
    public static void main(String[] args) {
        int myarray [] = new int[4];

        String newS[] = new String [2];

        myarray[0] =1;
        myarray[1] =10;
        myarray[2] =20;
        myarray[3] =21;

        newS[0] ="adnan";
        newS[1] ="opu";


        System.out.println("my int length: "+ myarray.length+" and my String length: "+ newS.length);
        System.out.println("My int value for length 2: "+myarray[2]+" and my String value for length 0: "+newS[0]);
        //System.out.println("\n");
        System.out.println("----------------------------------------------------");

        // adding number in one method
        int myarray1 [] = {12,14,16,17,18,19};
        String newS1 [] = {"Adnan","A. Opu", "Nayem","Showrov","Samian","Aminul"};


        System.out.println("my int length " + myarray1.length);
        System.out.println("my string length " + newS1.length);
        //System.out.println("\n");
        System.out.println("----------------------------------------------------");
        System.out.println("serial"+ "\t"+ "name"+ "\t"+"number");
        for(int x =0;x<1 ;x++){ //whole process run once and give me all results one
            for(int y =0; y<newS1.length; y++){

                System.out.println(y+"\t"+"\t" + newS1[y]+"\t"+ myarray1[y]);

            }
        }
        System.out.println("\n");
        System.out.println("---------------Multidimensional Array--------------------------");
        //multidimensional Array

        int ad [][]={{10,20,30,40,50},{5,10,15,20,25}};
        int  op [][]={{50,40,30,20,10},{25,20,15,10,5}};
        int flength = ad[0].length;
        int slength = ad[1].length;
        System.out.println("first length is " + flength);
        System.out.println("second length is " + slength);

        System.out.println( " first multidimensional, 2nd value  " +ad[0][1]);
        System.out.println( " 2nd multidimensional, first value  " +ad[1][0]);

        System.out.print("first curly braces results: ");
        for(int k =0; k<flength;k++) {
            System.out.print(ad[0][k] + "\t");
        }
        System.out.println("\n"+"-------------");



//using method
        System.out.println("my first table ");
        multiarray(ad);

        System.out.println("my second table ");
        multiarray(op);




    }

    //create a loop method
    public static void multiarray(int z[][]){
        for (int x = 0; x < z.length; x++) {
            for (int y = 0; y < z[x].length; y++) {
                System.out.print(z[x][y] + "\t");
            }
            System.out.println();
        }
    }
}