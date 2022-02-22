import java.util.Scanner;

public class b_2071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 높이
        int m = sc.nextInt(); // 종류

        int arr[][] = new int[n][n];

        // 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 1;
            }
        }

        // 배열 값 삽입
        for (int i = 1; i < n - 1; i++) { // 1 2 3
            for (int j = 0; j <= i; j++) { // 0<=1 0<=2 0<=3 10 11 20 21 22 30 31 32 33
                arr[i][j] = arr[i - 1][j + 1] + arr[i][j + 1]; // 01 02 03
            }
        }

        for (int i = 0; i < n; i++) { // 0 1 2 3 4
            if (m == 1)
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            System.out.println();
        }

        if (m == 2) {

        }

        if (m == 3) {

        }
    }

}
