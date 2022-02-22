import java.util.Scanner;

public class b_1430 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = Integer.toString(a*b*c); // 계산 결과값


        int arr[] = new int[10];
        for(int i=0; i<result.length(); i++) {
            arr[result.charAt(i)-'0']++; // char -> int (char - '0' 하면 숫자로 인식)
        }
        
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
