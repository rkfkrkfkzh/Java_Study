public class Code10 {
    public static void main(String[] args) {

        int n = 21;

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
//            각각의 정수 n에 대해서 for문을 돌면서 2보다 크거나 같은 약수가 있는지 검사한다.
//            하나라도 약수가 있다면 이미 소수가 아니므로 더이상 검사할 필요가 없다.
//            뱐스 isPrime이 어떤 역할을 하는지 생각해보자
            if (n % i == 0)
                isPrime = false;

        }
        if (isPrime)
        System.out.println(n);
    }
}
