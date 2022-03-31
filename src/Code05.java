public class Code05 {
    public static void main(String[] args) {

        int[] grades;
//      배열 선언 방법
        grades = new int[5];
//      배열의 크기를 지정하면서 생성 배열이 만들어지는 시점

//        int[] grades=new int[]; 한라인으로 만들수 있다.

//        double [] array;
//        array = new double[10];
//
//        char [] word = new char[100];

        grades[0] = 100;
        grades[1] = 90;
        grades[2] = 80;
        grades[3] = 70;
        grades[4] = 60;
//      배열의 각 칸에 데이터를 저장하고, 저장된 데이터를 읽기 위해서 [] 사용
//      배열 인덱스는 0부터 시작
        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);
        System.out.println(grades[4]);
    }
}
