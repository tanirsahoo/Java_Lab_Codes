package Method_Overloading;

import java.util.Scanner;

class ob_para{
    int first_num , second_num ;
    ob_para(int a , int b) {
        this.first_num = a;
        this.second_num = b;
    }
    int add_num(){
        return (first_num + second_num) ;
    }
    int mult(){
        return (first_num * second_num) ;
    }
}
public class Object_as_Parameter {
    void display_result(ob_para kin){
        System.out.println("The Additional Value is: " + kin.add_num());
        System.out.println("The Multiplication Value is: " + kin.mult());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a , b ;
        System.out.println("Enter the value of a and b.");
        a = sc.nextInt() ;
        b = sc.nextInt() ;
        ob_para ob = new ob_para(a , b) ;
        Object_as_Parameter ob2 = new Object_as_Parameter() ;
        ob2.display_result(ob);
    }
}
