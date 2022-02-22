import java.util.Scanner;

public class b_1304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = 1;
        int num = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result = k + j * n;

                System.out.print(result + " ");
                num++;

                if (num % n == 0) {
                    k++;
                    System.out.println();
                }
            }
        }
    }
}
