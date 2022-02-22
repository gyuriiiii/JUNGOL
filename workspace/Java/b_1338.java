import java.util.Scanner;

public class b_1338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char arr[][] = new char[n][n];

        char ch = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '\0'; // 널값으로 초기화
            }
        }

        // 15
        // 24
        // 33
        // 42
        // 51

        // 25
        // 34
        // 43
        // 52
        // 35
        // 44
        // 53
        for (int i = 1; i <= n; i++) { // 1 2 3 4 5
            for (int j = i, k = n; j <= n; j++, k--) { // 12345 - 54321 // 2345 5432 // 345 543 // 45 54 // 5 5
                arr[j-1][k-1] = ch++;
                if (ch > 'Z')
                    ch = 'A';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");

                if (arr[i][j] == '\0') {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}