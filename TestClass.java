import java.util.*;

public class TestClass {
    static int N = 1000;
    static long dp[] = new long[N + 1];

    static void sieve() {
        int arr[] = new int[N + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= Math.sqrt(N); i++){
            if (arr[i] == 0){
                for (int j = i * i; j <= N; j += i){
                    arr[j] = 1;
                }
            }
        }

        long temp = 0;

        for (int i = 1; i <= N; i++) {
            if (arr[i] == 0) temp += i;
            dp[i] = temp;
        }
    }

    static void getFactors(long num) {
        int i;
        boolean flag = false;

        for (i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                System.out.print(i + " ");
            }
                

            if (i == num / i){
                flag = true;
            }
        }

        if (flag) i -= 2;

        for (; i >= 1; i--) {
            if (num % i == 0)
                System.out.print(num / i + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sieve();
        long num = dp[n] - dp[m - 1];
        getFactors(num);
        sc.close();
    }
}