package Abstract_class ;
import java.util.Scanner;

abstract class twoDFigure{
    int p ;
    twoDFigure(int a){
        p = a ;
    }
    void display(){
        System.out.println("The Value of p is: " + p);
    }
    abstract public void calc_area() ;
}
class rectangle extends twoDFigure{
    int a , b ;
    rectangle(int p , int q , int r){
        super(r) ;
        a = p ;
        b = q ;
    }
    public void calc_area(){
        int area = a * b ;
        System.out.println("The area of the rectangle is: " + area);
    }
}
class triangle extends twoDFigure{
    int a , b ;
    triangle(int bh , int h , int r){
        super(r) ;
        a = bh ;
        b = h ;
    }
    @Override
    public void calc_area() {
        int area = (b * a) / 2 ;
        System.out.println("The area of the triangle is: " + area);
    }
}
public class code_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter your choice:\n1: Area of the rectangle.\n2:Area of the triangle.");
        int ch = sc.nextInt() ;
        switch(ch){
            case 1:
                System.out.println("The Length of the rectangle:");
                int a = sc.nextInt();
                System.out.println("The Breadth of the rectangle:");
                int b = sc.nextInt() ;
                System.out.println("Enter the value of r:");
                int r = sc.nextInt() ;
                rectangle ob = new rectangle(a , b , r) ;
                ob.calc_area();
                ob.display();
                break ;
            case 2:
                System.out.println("The height of the triangle:");
                int h = sc.nextInt();
                System.out.println("The base of the triangle:");
                int bh = sc.nextInt() ;
                System.out.println("Enter the value of r:");
                int rd = sc.nextInt() ;
                triangle ob1 = new triangle(h , bh , rd) ;
                ob1.calc_area();
                ob1.display();
                break ;
            default:
                System.out.println("Wrong Input");
                break ;
        }
    }
}
