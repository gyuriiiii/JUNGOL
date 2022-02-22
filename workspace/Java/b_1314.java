import java.util.Scanner;

public class b_1314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char arr[][] = new char[n][n];
        char k = 'A';

        // 11 21 31 41
        // 42 32 22 12
        // 13 23 33 43
        // 44 34 24 14
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // 짝수줄
                for (int j = 0; j < n; j++) {  
                    arr[j][i] = k;
                    k++;

                    if(arr[j][i] == 'z' || arr[j][i] == 'Z') 
                        k = 'A';
                }
            }

            else { // 홀수줄
                for (int j = n-1; j >= 0; j--) { 
                    arr[j][i] = k;
                    k++;

                    if(arr[j][i] == 'z' || arr[j][i] == 'Z') 
                        k = 'A';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}