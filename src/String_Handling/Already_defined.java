package String_Handling;

import java.util.Scanner;

public class Already_defined {
    public static String toString(char[] a){
        String String = new String(a) ;
        return String ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        char s[] = {'T' , 'a' , 'n' , 'i' , 'r'} ;
        System.out.println(toString(s));
    }
}
