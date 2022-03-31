public class Code01 {

    static int num; // 변수는 main 메서드 내부, 외부 선언 가능 클래스 외부 선언 불가
    // 외부 선언 변수가 반드시 static 이어야하는 것은 아님

    public static void main(String[] args) {

        int anotherNum = 5; //지역변수
        num = 2;
        //메서드 내부에 선언된 변수는 매서드 내에서만 가능
        //메서드 외부에 선언된 변수는 그 클래스 전체에서 사용

        System.out.println(num + anotherNum);
        System.out.println("Num: " + num);
        //"Num"은 문자열 (String), num은 정수
        //+양쪽중 하나가 문자열이면 다른쪽도 문자열로 해석 두 문자열을 합친다.
        //따라서 "num: "+num은 "num: 2"라는 하나의 문자열
        System.out.println("AnotherNum: " + anotherNum);
        System.out.println("sum: " + num + anotherNum);
        System.out.println("sum: " + (num + anotherNum));

    }
}
