package Abstract_class ;
class A{
    void callme(){
        System.out.println("This is the master class");
    }
}
class B extends A{
    void callme(){
        System.out.println("This is the first child.");
    }
}
class C extends A{
    void callme(){
        System.out.println("This is the second child.");
    }
}
public class code_2 {
    public static void main(String[] args) {
        A ob = new A() ;
        ob.callme();
        ob = new B() ;
        ob.callme(); ;
        ob = new C() ;
        ob.callme();
    }
}
