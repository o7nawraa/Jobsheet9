import java.util.Scanner;
public class AssignmentArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summary = 0;
        double average = 0;

        System.out.print("Input Number of elements: ");
        int n = sc.nextInt();
        int[] array = new int [n];

        for (int i=0; i<array.length; i++){
            System.out.print("Input value of element " + i + ": ");
            array[i] = sc.nextInt();
            summary += array[i];
        }
        
        average = summary/array.length;
        System.out.println("The average of the value is " + average);

        int highestValue = array[0];
        int lowestValue = array[0];

        for (int i=0; i<array.length; i++) {
            if (array[i]>highestValue) {
                highestValue = array[i];
            }
            if (array[i]<lowestValue) {
                lowestValue = array[i];
            }
        }

        System.out.println("The highest value is " + highestValue);
        System.out.println("The lowest value is " + lowestValue);

    }
}
