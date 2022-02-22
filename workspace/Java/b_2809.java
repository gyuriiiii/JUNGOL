import java.util.Scanner;

public class b_2809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sq = (int)Math.sqrt(n); // n의 제곱근 저장
        int arr[] = new int[10000]; // n의 약수 저장위해
        int cnt = 0; 
        
        // n의 제곱근까지만 반복문 실행
        for(int i=1; i<=sq; i++) {
            if(n % i == 0) {
                arr[cnt++] = i; // 작은 수 저장

                if(n/i != i) { // 예로, 10*10=100 같은 경우가 아닐 때
                    arr[cnt++] = n/i;
                }
            }
        }

        for(int i=0; i<cnt; i++) {
            for(int j=0; j<(cnt-1)-i; j++) {
                int temp = 0;
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 작은 순으로 약수 출력
        for(int i=0; i<cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
