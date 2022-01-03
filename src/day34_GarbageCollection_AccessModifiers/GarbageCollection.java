package day34_GarbageCollection_AccessModifiers;


import day33_Statics.Iphone;

public class GarbageCollection {

    public static void main(String[] args) {
        /*
        //  int n = null;
       String str = null;
        System.out.println( str.toUpperCase() );
         */

        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println( str );

        Iphone iphone = new Iphone();






    }

}
