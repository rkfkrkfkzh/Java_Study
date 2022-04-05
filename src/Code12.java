import java.util.Scanner;
//  n개의 정수를 입력받아 배열에 저장한다.
// 이들 중에서 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값을 구하여
//출력하는 프로그램
public class Code12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
            kb.close();

            int maxSum = 0;
            for (int j = 1; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += data[k];
                    if (sum > maxSum)
                        maxSum = sum;
                }

            }
            System.out.println("The max sum is" + maxSum);

        }
    }
}
