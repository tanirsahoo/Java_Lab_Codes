package Interface ;
interface ob{
    interface on_child{
        void display() ;
    }
}
class check implements ob.on_child{
    public void display(){
        System.out.println("This is a small reminder.");
    }
}
public class nested_interface {
    public static void main(String[] args) {
        check ob = new check();
        ob.display();
    }
}
