import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of student? ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("student of courses? ");
        int numberOfCourses = scanner.nextInt();

        int[][] grades = new int[numberOfStudents][numberOfCourses];

        int total = 0;

        for (int counter = 0; counter < numberOfStudents; counter++){
            System.out.println("Enter score for student " + counter);


            for (int counter1 = 0; counter1 < numberOfCourses; counter1++) {
                System.out.print("Course" + (counter1 + 1) + ": ");
                grades[counter][counter1] = scanner.nextInt();
                total += grades[counter][counter1];
            }
            System.out.println();

        }


        for(int counter = 1; counter <= numberOfCourses; counter++){
            System.out.print("          Subject " + counter);
        }

        System.out.println();


        for(int counter = 0; counter < numberOfStudents; counter++){
            System.out.printf("Student%-7d", (counter + 1));

            for(int counter1 = 0; counter1 < numberOfCourses; counter1++){
                System.out.printf("%-18d", grades[counter][counter1]);
            }

            System.out.println();
        }




    }


}






