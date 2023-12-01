package Exception_Handling;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "This is an exception";
    }
    public String getMessage(){
        return "This is an exception" ;
    }
}

public class throw_keyword{
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number");
        a = sc.nextInt() ;
        if (a < 10){
        try{
            throw new MyException() ;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
//            System.out.println(e);
        }
        }
    }
}