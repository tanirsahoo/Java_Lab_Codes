package Interface ;
import java.util.Scanner;

interface ab1{
    void display_number() ;
    String calling_number() ;
}

interface ab2{
    void new_number() ;
}

class ab3 implements ab1 , ab2{
    public void display_number(){
        System.out.println("The number is: " + "6841651361");
    }
    public String calling_number(){
        return "I am a hero" ;
    }
    public void new_number(){
        System.out.println("The new Calling number is: " + "6516516555");
    }
}

public class interface_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ab3 ob = new ab3() ;
        ob.display_number();
        ob.new_number();
    }
}
