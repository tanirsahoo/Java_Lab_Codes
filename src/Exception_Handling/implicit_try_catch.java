package Exception_Handling;

public class implicit_try_catch {
    static void check_condition(int p , int q){
        try{
            int r = p / q ;
            System.out.println("The division result is: " + r);
        }
        catch(ArithmeticException e){
            System.out.println("The Exception is: " + e);
        }
    }
    public static void main(String[] args) {
        try{
            check_condition(9 , 0);
        }
        catch(Exception e){
            System.out.println("Some Exception has occured");
        }
    }
}
