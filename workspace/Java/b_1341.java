import java.util.*;

public class b_1341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s;
        int e;

        int min;
        int max;

        while (true) {
            s = sc.nextInt();
            e = sc.nextInt();

            if ((s < 2 || s > 9) || (e < 2 || e > 9)) {
                System.out.println("INPUT ERROR!");
                continue;
            }

            else {
                break;
            }
        }

        // 구구단 출력
        
        int num = 0;

        if (s > e) {
            for (int i = s; i >= e; i--) {
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %2d   ", i, j, i * j);
                    num++;
                    
                    if(num % 3 == 0)  {
                        System.out.println();
                    }
                }
                System.out.println();
            }
        }

        else {
            for (int i = s; i <= e; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %2d   ", i, j, i * j);
                    num++;

                    if(num % 3 == 0)  {
                        System.out.println();
                    }
                }
                System.out.println();
            }
        }
    }
}