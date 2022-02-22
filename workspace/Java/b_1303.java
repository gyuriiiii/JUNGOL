import java.util.*;

public class b_1303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;

        n = sc.nextInt();
        m = sc.nextInt();

        int k = 1;
        int num = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(k + " ");
                k++;
                num++;
                if(num % m ==0) {
                    System.out.println();
                }
            }
        }
    }
}