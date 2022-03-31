import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        String name = null;
        int age;
        String gender;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please type your name and your age and your gender: ");
        name = kb.next();
        age = kb.nextInt();
        gender = kb.next();
//      연속해서 키보드로 부터 읽는다
        if (gender.equals("male")) //string literal
            System.out.println(name + " ,you're " + age + " years old man.");
        else if (gender.equals("female"))
            System.out.println(name + " ,you're " + age + " years old woman.");
        else
            System.out.println("Hmm... interesting");
//      이렇게 if ~else if ~else 같이 연속해서 비교 가능
        kb.close();
    }
}
