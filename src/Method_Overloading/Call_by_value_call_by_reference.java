package Method_Overloading;

import java.util.Scanner;

class test{
    int first_data , second_data ;
    test(int a , int b){
        this.first_data = a ;
        this.second_data = b ;
    }
    int sum(int a , int b){
        return (a + b) ;
    }
}
public class Call_by_value_call_by_reference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a , b , c , d ;
        System.out.println("Enter the value of first num and second num");
        a = sc.nextInt() ;
        b = sc.nextInt() ;
        System.out.println("Enter the value you want to check for");
        c = sc.nextInt() ;
        d = sc.nextInt() ;
        test ob = new test(a , b) ;
        System.out.println("Call by value example: " + ob.sum(c , d));
        System.out.println("Call by reference example:" + ob.sum(ob.first_data , ob.second_data));
    }
}
