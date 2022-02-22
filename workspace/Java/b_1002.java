import java.util.Scanner;

public class b_1002 {
    public static int get_gcd(int a, int b) {
        int ans = 0;
        
        for(int i=1; i<=a; i++) {
            if(a%i == 0 && b%i==0) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) { // n개의 정수 입력받기
            arr[i] = sc.nextInt();
        }

        int gcd = arr[0]; // 최대공약수
        int lcm = arr[0]; // 최소공배수


        for(int i=0; i<n; i++) {
            gcd = get_gcd(gcd, arr[i]);
            lcm = (lcm * arr[i]) / get_gcd(lcm, arr[i]);
        }

        System.out.print(gcd + " " + lcm);
    }
}
