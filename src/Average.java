import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long mod = 1000000007;
        System.out.println("Enter the number 1: ");
        long n1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        long n2 = sc.nextInt();
        System.out.println("Enter the number 3: ");
        long n3 = sc.nextInt();
        long res = (n1 + n2 + n3)/2;
        System.out.println("The average of 3 numbers is: "+res%mod);
    }
}
