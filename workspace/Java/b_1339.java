import java.util.Scanner;

public class b_1339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 5

        if (n <= 0 || n > 100 || n % 2 == 0) { // 1이상 100이하의 홀수 아닌 경우
            System.out.print("INPUT ERROR");
            return;
        }

        char arr[][] = new char[n][n]; // 배열
        char k = 'A';

        for (int i = n / 2 + 1; i > 0; i--) { // 3 2 1
            for (int j = i; j <= n - i + 1; j++) { // 3 <= 3 // 2 <= 4 // 1 <= 5
                arr[j - 1][i - 1] = k;
                k++;

                if (k > 'Z')
                    k = 'A';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == '\0') arr[i][j] = ' ';
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
