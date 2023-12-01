package Static_keyword;

class complex{
    double real , im ;
    static int count = 1 ;
    complex(){}
    complex(double r , double i){
        real = r ;
        im = i ;
    }
    static void setvalue(){
        count ++ ;
        System.out.println("Count done: " + count);
    }
    complex calc (complex c1 , complex c2){
        complex resa = new complex() ;
        complex resb = new complex() ;
        complex resp = new complex() ;
        resa.real = c1.real + c2.real ;
        resa.im = c1.im + c2.im ;
        resb.real = c1.real - c2.real ;
        resb.im = c1.im - c2.im ;
        resp.real = c1.real * c2.real - c1.im * c2.im ;
        resp.im = c1.real * c2.im + c1.im * c2.real ;
        System.out.println("Sum is: " + resa.real + "(i)" + resa.im);
        System.out.println("Difference is: " + resb.real + "(i)" + resb.im);
        return resa ;
    } ;
    void calc1(complex c3){
        complex comp = new complex() ;
        comp.real = c3.real ;
        comp.im = -1 * c3.im ;
        System.out.println("Complement is: " + comp.real + "(i)" + comp.im);
        complex module = new complex() ;
        System.out.println("Modulus is: " + Math.sqrt(Math.pow(c3.real , 2) + Math.pow(c3.im , 2)));
    }
}
public class complex_class {
    public static void main(String[] args) {
        complex c1 = new complex(1 , 2) ;
        complex c2 = new complex(2 , 3) ;
        complex.setvalue();
        complex c3 = new complex() ;
        c3 = c3.calc(c1 , c2) ;
        complex c4 = new complex() ;
        c4.calc1(c3);
    }
}
