import java.util.Scanner;
public class ArrayAverageScore07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double average;
        double fail = 0, counterFail = 0, pass = 0, counterPass = 0;
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        int[] score = new int [n];
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i]>70) {
                pass+=score[i];
                counterPass++;
            } else if (score[i]<70) {
                fail+=score[i];
                counterFail++;
            }   
        } 
        
        average = pass / counterPass;
        System.out.println("The average score of students who passed is " + average);
        average = fail / counterFail;
        System.out.println("The average score of student who failed is " + average);
    }
}
