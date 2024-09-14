import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long mod=1000000007;
        System.out.println("Enter the number 1: ");
        long n1=sc.nextInt();
        System.out.println("Enter the number 2: ");
        long n2=sc.nextInt();
        long res=n1*n2;
        System.out.println("Produce of the 2 numbers is: "+res%mod);
    }
}
