import java.util.Scanner;

public class b_1658 {
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

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = get_gcd(a, b); // 최대 공약수
        int lcm = a*b/gcd; // 최소 공배수
        
        System.out.print(gcd + "\n" + lcm);
    }
}
