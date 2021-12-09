package day23_CustomMethods_Void;

public class CustomMethodsWIthParameters {

    public static void main(String[] args) {

      //  oddOrEven(); // the method demands additional info to complete its task

        oddOrEven(10);



    }


    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){ // 10

        if(number % 2 == 0){
            System.out.println(number +" is even number");
        }else{
            System.out.println(number +" is odd number");
        }

    }


    // create a function that can display the age of the person


}
