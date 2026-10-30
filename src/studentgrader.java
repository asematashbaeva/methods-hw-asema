
import java.util.Scanner;

public class studentgrader {

    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid score!";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = input.nextInt();

        String grade = calculateGrade(score);

        System.out.println("Your grade is: " + grade);
6
    }
}
