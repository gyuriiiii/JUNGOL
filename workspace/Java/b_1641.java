import java.util.Scanner;

public class b_1641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 삼각형 높이
        int m = sc.nextInt(); // 삼각형 종류

        int arr[][] = new int[n][n]; // 배열 생성
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0; // 초기화
            }
        }

        if(n>100 || n%2==0 || m <1 || m>3) {
            System.out.println("INPUT ERROR!");
            return;
        }

        int k = 1;
        if (m == 1) {
            for (int i = 0; i < n; i++) { // 0 1 2 3 4
                // i값 : 0,2,4
                // 00
                // 20 21 22
                // 40 41 42 43 44
                if (i % 2 == 0) {
                    for (int j = 0; j <= i; j++) { // 0<=0 0<=2 0<=4
                        arr[i][j] = k; // 00 20 21 22 40 41 42 43 44
                        k++;
                    }
                }

                // i값 : 1, 3
                // 11 10
                // 33 32 31 30
                if (i % 2 == 1) {
                    for (int j = i; j >= 0; j--) { // 1>0 3>0
                        arr[i][j] = k;
                        k++;
                    }
                }
            }
        }

        if (m == 2) {
            for (int i = 0; i < n; i++) { // 0 1 2 3 4
                // 공백 0 1 2 3 4
                for (int h = 0; h < i; h++) {
                    System.out.print("  ");
                }

                // 9 7 5 3 1
                for (int j = 1; j < n * 2 - i * 2; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

        if (m == 3) {
            for (int i = 0; i < n; i++) { // 0 1 2 3 4
                // 00 10 20 30 40 - 1 (5번)
                // 11 21 31 - 2 (3번)
                // 22 - 3 (1번)
                for(int j=0; j<n-(i*2); j++) { // 0<5 0<3 0<1
                    arr[j+i][i] = i+1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) // 값이 저장이 안됐으면 (초기화 값 그대로면 )
                    continue;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
