package Abstract_class ;
import java.util.Scanner ;
class above_class{
    int a ;
    above_class(int p){
        a = p ;
    }
    void display(){
        System.out.println("The Value of a is: " + a);
    }
}

class child_one extends above_class{
    int a , b ;
    child_one(int p , int q , int r){
        super(r) ;
        a = p ;
        b = q ;
    }
    void display(String new_msg){
        System.out.println("The value of a and b in this program is: " + a + " and " + b);
        System.out.println("The message in the string is: " + new_msg);
    }
}

class child_one2 extends above_class{
    int d , c ;
    child_one2(int p , int q){
        super(q) ;
        d = p ;
    }
    void display(String msg1 , String msg2){
        System.out.println("The value of d is: " + d);
        System.out.println("The message inside msg1 is: " + msg1);
        System.out.println("The message inside msg1 is: " + msg2);
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        child_one ob1 = new child_one(9, 8 , 6) ;
        child_one2 ob2 = new child_one2(9, 8 ) ;
        ob1.display("Hello World");
        ob2.display("This is a new World" , "I Love this world");
    }
}
