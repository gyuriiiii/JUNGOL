import java.util.Scanner;

public class b_1307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 한 변의 길이

        char arr[][] = new char[n][n];
        char c = 'A';

        // 44 34 24 14
        // 43 33 23 13
        // 42 32 22 12
        // 41 31 21 11
        for (int i = n-1; i >= 0; i--) { // 4 3 2 1
            for (int j = n-1; j >= 0; j--) { // 4 3 2 1
                arr[j][i] = c;
                c++;

                if(arr[j][i] == 'z' || arr[j][i] == 'Z')  {
                    c = 'A';
                }
            }
        }

        // 출력
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
