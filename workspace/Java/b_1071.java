import java.util.Scanner;

public class b_1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정수의 개수
        int num[] = new int[n]; 

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt(); // n개의 정수 입력받기
        }

        int m = sc.nextInt(); // 약수/배수 구할 정수
        int measure = 0; // 약수의 합 
        int multiple = 0; // 배수의 합
        
        for(int i=0; i<num.length; i++) {
            // m의 약수 합
            if(m % num[i] == 0) measure += num[i];
            // m의 배수 합
            if(num[i] % m == 0) multiple += num[i];
        }

        System.out.println(measure);
        System.out.println(multiple);
    }
}
