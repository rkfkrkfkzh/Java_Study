import java.util.Scanner;
//import문은 C언어의 include와 유사 라이브러리에 포함된 기능 사용
public class Code02 {
    public static void main(String[] args) {

        int num = 123;

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter an Integer: ");
        int input = kb.nextInt();

        if (input == num) {
            System.out.println("Numbers match! :-)");
        } else {
            System.out.println("Numbers do not match! :-(");
        }
    }
}
