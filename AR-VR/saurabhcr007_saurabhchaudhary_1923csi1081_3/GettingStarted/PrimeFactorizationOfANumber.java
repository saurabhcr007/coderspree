import java.util.*;

public class PrimeFactorizationOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
                n = n / i;
            } else {
                i++;
            }
        }
    }
}
