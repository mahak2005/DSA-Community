import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int n=sc.nextInt();
        System.out.println("Is the number palindrome: "+isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        if(n<=9){
            return true;
        }
        int reversed=Reverse.reverseNoUpdated(n);
        if(n==reversed){
            return true;
        }
        return false;
    }
}
