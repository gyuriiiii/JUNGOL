import java.util.Scanner;

public class b_1337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n]; // 배열

        int x = -1;
        int y = -1;

        int k = 0;
        for (int i = 0; i < n; i++) { // 0 1 2 3 4 5
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) { // 0 3
                    x++;
                    y++;
                }

                if (i % 3 == 1) { // 1 4
                    x--;
                }

                if (i % 3 == 2) { // 2 5
                    y--;
                }
                
                arr[x][y] = (k++) % 10;
            }
        }

        for (int i = 0; i < n; i++) { // 0 1 2 3 4 5                                                                               
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
