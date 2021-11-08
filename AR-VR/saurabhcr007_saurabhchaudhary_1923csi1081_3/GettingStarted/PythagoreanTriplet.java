import java.util.*;
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                if (a*a == b*b + c*c) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            else{
                if (c*c == b*b + a*a) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }    
        }
        else{
            if(b>c){
                if (b*b == a*a + c*c) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            else{
                if (c*c == b*b + a*a) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            
        }            
    }    
}
