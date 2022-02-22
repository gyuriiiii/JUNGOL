import java.util.ArrayList;
import java.util.Scanner;

public class b_1402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = 0; // 약수 개수

        // 약수 저장할 배열
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // n의 약수 구하기
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                num++;
                if(num == k) {
                    System.out.println(i);
                    break;
                }
            }
        }
        
        if(num < k) {
            System.out.println(0);
        }
    }
}
