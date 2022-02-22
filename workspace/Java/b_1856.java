import java.util.*;

public class b_1856 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 높이
        int m = sc.nextInt(); // 너비
        int[][] arr = new int[n][m]; // 배열

        int num = 1;

        for(int i=0; i<n; i++) {
            if(i % 2 ==0) { // 짝수줄
                for(int j=0; j<m; j++) {
                    arr[i][j] = num++;
                }
            }
            
            else { // 홀수줄
                for(int j=m-1; j>=0; j--) {
                    arr[i][j] = num++;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}