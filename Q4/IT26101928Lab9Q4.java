import java.util.Scanner;

public class IT26101928Lab9Q4 {

    public static double calFinalMark(double assignment, double exam) {
        return assignment * 0.3 + exam * 0.7;
    }

    public static char findGrade(double finalMark) {
        if (finalMark >= 75) return 'A';
        else if (finalMark >= 60) return 'B';
        else if (finalMark >= 50) return 'C';
        else return 'F';
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-10.2f %c\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        double[] finals = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i+1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = sc.nextDouble();
            System.out.println();

            finals[i] = calFinalMark(assignment, exam);
            grades[i] = findGrade(finals[i]);
        }

        System.out.printf("\n%-15s %-10s %s\n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finals[i], grades[i]);
        }

        sc.close();
    }
}