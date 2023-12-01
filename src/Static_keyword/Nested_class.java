package Static_keyword;

class Outerclass {
    static int outer_x = 10 ;
    int outer_y = 20 ;
    private int outer_private = 30 ;
    class Innerclass{
        void display(){
            System.out.println("Outer_x: " + outer_x);
            System.out.println("Outer_y: " + outer_y);
            System.out.println("Outer_private: " + outer_private);
        }
    }
}
public class Nested_class{
    public static void main(String[] args) {
        Outerclass outerobject = new Outerclass() ;
        Outerclass.Innerclass innerclass = outerobject.new Innerclass() ;
        innerclass.display();
    }
}