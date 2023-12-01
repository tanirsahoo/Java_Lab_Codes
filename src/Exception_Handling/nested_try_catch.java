package Exception_Handling;

public class nested_try_catch {
    public static void main(String[] args) {
        int ar[] = {1 , 6 , 0 , 4} ;
        int p = 10 ;
        try {
            try {
                for (int i = 0; i <= ar.length; i++) {
                    int k = p / ar[i];
                    System.out.println("The Division result is: " + k);
                }
            }
            catch(ArithmeticException e){
                System.out.println("The Arithmetic Exception is: " + e);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is an array index out of bound exception: " + e);
        }
    }
}
