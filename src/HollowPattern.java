import java.util.Scanner;

public class HollowPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        print(rows, cols);
    }

    public static void print(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            if (i == 0 || i == rows - 1) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j < cols - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


