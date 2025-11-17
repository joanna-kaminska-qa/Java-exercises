import java.util.Scanner;
import java.util.ArrayList;

public class Rozne {
    public static void main(String[] args) {

        Grades.getGrades();

    }
}

class Grades {

    enum StudentStatus {
        EXCELLENT, // średnia 5.0 - 6.0
        GOOD, // średnia 4.0 - 4.99
        AVERAGE, // średnia 3.0 - 3.99
        POOR // średnia poniżej 3.0
    }

    public static void getGrades() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile ocen chcesz wprowadzić? ");
        int numberOfGrades;

        while (true) {
            numberOfGrades = scanner.nextInt();
            if (numberOfGrades > 0)
                break;
            System.out.print("Podaj poprawną liczbę ocen (minimum 1): ");
        }

        ArrayList<Integer> gradesList = new ArrayList<Integer>();

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Podaj ocenę #" + (i + 1) + ": ");
            int grade = scanner.nextInt();

            if (grade >= 1 && grade <= 6) {
                gradesList.add(grade);
            } else {
                System.out.println("Niepoprawna ocena. Spróbuj ponownie.");
                i--;
            }
        }

        double sum = 0;
        for (int grade : gradesList) {
            sum += grade;
        }

        double average = sum / gradesList.size();
        System.out.println("Średnia ocen: " + average);

        int max = gradesList.get(0);
        for (int grade : gradesList) {
            if (grade > max) {
                max = grade;
            }
        }

        System.out.println("Najwyższa ocena: " + max);

        int min = gradesList.get(0);
        for (int grade : gradesList) {
            if (grade < min) {
                min = grade;
            }
        }
        System.out.println("Najniższa ocena: " + min);

        StudentStatus status;

        if (average >= 5.0) {
            status = StudentStatus.EXCELLENT;
        } else if (average >= 4.0) {
            status = StudentStatus.GOOD;
        } else if (average >= 3.0) {
            status = StudentStatus.AVERAGE;
        } else {
            status = StudentStatus.POOR;
        }

        System.out.println("Status ucznia: " + status);
    }
}
