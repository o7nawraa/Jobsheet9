import java.util.Scanner;
public class ArrayAverageScore07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] score = new int [10];
        double total = 0;
        double average;
        int counter = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i]>70) {
                System.out.println("Student Score " + (i+1) + " Is Passed!");
                counter++;
            }
            total += score[i];
        } 
        System.out.println("Total student who passed is " + counter);
        average = total / score.length;
        System.out.println("The class average score is " + average);
    }
}
