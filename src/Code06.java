public class Code06 {
    public static void main(String[] args) {

        int[] grades = new int[5];

        grades[0] = 100;
        grades[1] = 95;
        grades[2] = 66;
        grades[3] = 77;
        grades[4] = 88;

        for (int i = 0; i < grades.length; i++) {
            System.out.println("grades " + (i + 1) + ": " + grades[i]);
        }
    }
}
