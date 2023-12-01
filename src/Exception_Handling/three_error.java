package Exception_Handling;

public class three_error {
    public static void main(String[] args) {
        String po = "" ;
        int ar[] = {1 , 6 , 0 , 4} ;
        int p = 10 ;
        try {
            for (int i = 0 ; i <= ar.length ; i ++) {
                int k = p / ar[i];
            }
            int len = po.length() ;
            System.out.println("The length of the sting is: " + len);
        }
        catch(ArithmeticException e){
            System.out.println("Some Arithmetic Exception has occured: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception has occured: " + e);
        }
        catch(NullPointerException e){
            System.out.println("The Null Point Exception is: " + e);
        }
    }
}
