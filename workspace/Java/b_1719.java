import java.util.Scanner;

public class b_1719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 삼각형의 높이
        int m = sc.nextInt(); // 삼각형의 종류

        if(n>100 || n%2==0 || m <1 || m > 4) {
            System.out.println("INPUT ERROR!");
            return;
        }

        // n = 5
        if (m == 1) { // 1 2 3 2 1
            for (int i = 0; i < n / 2 + 1; i++) {
                for (int k = 0; k < i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i < n - (n / 2 + 1); i++) { // 0 1
                for (int k = 0; k < n / 2 - i; k++) { // 2 1
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if (m == 2) { // 1 2 3 2 1
            for (int i = 0; i < n / 2 + 1; i++) {
                // 공백 출력 2 1 0
                for (int j = 1; j < (n / 2 + 1) - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i < n - (n / 2 + 1); i++) { // 0 1
                // 공백 출력 1 2
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < n / 2 - i; k++) { // 2 1
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if (m == 3) { // 5 3 1 3 5
            for (int i = 0; i < n / 2 + 1; i++) { // 0 1 2
                // 공백 출력 0 1 2
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < n - i * 2; k++) { // 5 3 1
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i < n - (n / 2 + 1); i++) { // 0 1
                // 공백 출력 1 0
                for (int j = 0; j < (n / 2 - 1) - i; j++) { // 다시!!
                    System.out.print(" ");
                }

                for (int k = 0; k < 3 + (i * 2); k++) { // 3 5
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if (m == 4) { // 3 2 1 2 3
            for (int i = 0; i < n / 2 + 1; i++) { // 0 1 2
                // 공백 0 1 2
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < (n / 2 + 1) - i; k++) { // 3 2 1
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i < n - (n / 2 + 1); i++) { // 0 1
                // 공백 2 2
                for (int j = 0; j < n / 2; j++) {
                    System.out.print(" ");
                }

                // n = 5 1
                // n = 7 1
                // n%2+i+1 = 2 3 4
                for (int k = 0; k < (n % 2) + i + 1; k++) { // 5 : 2 3 // 7 : 2 3 4
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}