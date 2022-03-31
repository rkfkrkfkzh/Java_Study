import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        String str = "gg g";
        String input = null;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter an Integer: ");
        input = kb.nextLine();
//        next()메서드는 하나의 문자열을 읽어준다.
//        이외에도 실수를 읽을때는 nextDouble(),
//        한라인을 다 읽을때는 nextLine()등이있다.

        if (str.equals(input)) {
//            String 간의비교는 == 연산자로 할 수 없다
//            equals 메서드를 사용한다. 이문장은 input.equals(str)도 가능
//            결과는 true or false 이다
            System.out.println("Numbers match! :-)");
        } else {
            System.out.println("Numbers do not match! :-(");
        }
        kb.close();
    }
}
