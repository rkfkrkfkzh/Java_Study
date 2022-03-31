public class Code10 {
    public static void main(String[] args) {

        int n = 21;

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                isPrime = false;

        }
        if (isPrime)
        System.out.println(n);
    }
}
