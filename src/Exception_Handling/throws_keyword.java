package Exception_Handling;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
public class throws_keyword {
    public static double area(int r) throws NegativeRadiusException{
        if(r < 0){
            throw new NegativeRadiusException() ;
        }
        double result = Math.PI * r * r ;
        return result ;
    }
    public static int divide(int a , int b) throws ArithmeticException{
        int result = a / b ;
        return result ;
    }
    public static void main(String[] args) {
        try{
//            int asn = divide(6 , 0) ;
//            System.out.println("The result after division is: " + asn);

            double rslt = area(-10) ;
            System.out.println("The area is: " + rslt);
        }
        catch (Exception e){
            System.out.println("There is an exception");
        }
    }
}
