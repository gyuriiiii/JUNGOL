import java.util.Scanner;

public class b_1329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 100 || n < 0 || n % 2 == 0) {
            System.out.println("INPUT ERROR!");
            return;
        }

        // n = 7
        for (int i = 0; i < n / 2 + 1; i++) { // 0 1 2 3
            // 공백 0 1 2 3
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 + 1; j++) { // 1 3 5 7
                System.out.print("*");
            }
            System.out.println();
        }

        // 5
        // 1 0
        for (int i = 1; i <= n / 2; i++) { // 1 2 3
            // 공백 2 1 0
            for (int k = 0; k < n/2-i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - (i * 2); j++) { // 5 3 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}