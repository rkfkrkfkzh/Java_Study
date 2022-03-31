public class Code07 {
    public static void main(String[] args) {

        int[] grades = new int[5];

        grades[0] = 100;
        grades[1] = 95;
        grades[2] = 66;
        grades[3] = 77;
        grades[4] = 88;

        int i = 0;
        while(i<grades.length){
            System.out.println("Grade "+(i+1)+": "+grades[i]);
            i++;
        }
    }
}
