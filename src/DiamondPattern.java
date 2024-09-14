import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int spaces=n/2;
        int st=1;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int j = 1; j<= st; j++) {
                System.out.print("*");
            }
            if(i<=n/2){
                st+=2;
                spaces--;
            }
            else{
                st-=2;
                spaces++;
            }
            System.out.println();
        }
    }
}
