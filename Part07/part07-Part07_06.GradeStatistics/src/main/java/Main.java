
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistic gradeRepository = new GradeStatistic();

        System.out.println("Enter point totals, -1 stops: ");

        while (true) {

            int grade = scanner.nextInt();
            scanner.nextLine();
            if (grade == -1) {
                int[] distribution = gradeRepository.gradeDistribution();
                System.out.println("Point average (all): " + gradeRepository.averageGrades());
                if (gradeRepository.averagePassing() == -1) {
                    System.out.println("Point average (passing): -");
                } else {
                    System.out.println("Point average (passing): " + gradeRepository.averagePassing());
                }
                System.out.println("Pass percentage: " + gradeRepository.passPercentage());
                System.out.println("Grade distribution: ");
                System.out.print("5: ");
                printStar(distribution[5]);
                System.out.println("");
                System.out.print("4: ");
                printStar(distribution[4]);
                System.out.println("");
                System.out.print("3: ");
                printStar(distribution[3]);
                System.out.println("");
                System.out.print("2: ");
                printStar(distribution[2]);
                System.out.println("");
                System.out.print("1: ");
                printStar(distribution[1]);
                System.out.println("");
                System.out.print("0: ");
                printStar(distribution[0]);
                break;
            }
            if (grade >= 0 && grade <= 100) {
                gradeRepository.add(grade);
            }

        }

    }

    public static void printStar(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }
}
