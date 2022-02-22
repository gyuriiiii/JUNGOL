
import java.util.Scanner;

public class b_2046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 한 변의 길이
        int m = sc.nextInt(); // 종류

        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 종류 1번
                if (m == 1) {
                    System.out.print(k + " ");
                    if ((j + 1) % n == 0) {
                        System.out.println();
                        k++;
                    }
                }

                // 종류 2번
                else if (m == 2) {
                    if (i % 2 == 0) { // 짝수 줄
                        System.out.print(k + " ");
                        k++;
                    }

                    else { // 홀수 줄
                        k--;
                        System.out.print(k + " ");
                    }

                    if ((j + 1) % n == 0) {
                        System.out.println();
                    }
                }

                // 종류 3번
                else if (m == 3) {
                    System.out.print(k + (k*j) + " ");

                    if ((j + 1) % n == 0) {
                        System.out.println();
                        k++;
                    }
                }
            }
        }
        sc.close();
    }
}
