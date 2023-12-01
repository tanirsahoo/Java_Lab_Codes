package Method_Overloading;
import java.util.Scanner ;
public class method_overloading_code_1 {
        void check_date(){
            System.out.println("Inside Overloading");
        }
        void check_data(char n){
            int p = n ;
            System.out.println("The ASCII code of the character is: " + p );
        }
    public static void main(String[] args) {
            method_overloading_code_1 ob = new method_overloading_code_1() ;
            ob.check_date();
            ob.check_data('T');
        System.out.println("Code done");
    }
}
