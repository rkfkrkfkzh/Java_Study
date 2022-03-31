import java.util.Scanner;

//사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여 출력하는 코드
public class Code08 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++)
            data[i] = kb.nextInt();
        kb.close();

        int sum = 0, max = data[0];
        for (int i = 0; i < n; i++) {
            sum += data[i];
            if (data[i] > max) max = data[i];
        }
        System.out.println("The sum is " + sum + " and the maximum is " + max);
    }
}
