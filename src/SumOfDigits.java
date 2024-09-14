import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Sum of digits(Recursive way): "+ sumRec(n));
        System.out.println("Sum of digits(Iterative way): "+sumIterative(n));
    }
    private static int sumRec(int n){
        if(n<=0){
            return 0;
        }
        return n%10+sumRec(n/10);
    }
    private static int sumIterative(int n){
        if(n<=9){
            return n;
        }
        int sum=0;
        while (n>0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }
        return sum;
    }
}
