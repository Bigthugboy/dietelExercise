import java.util.Scanner;

public class StudentGrade {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("student name and student grade");
        int A = 0;
        int B = 0;
        int C = 0;
        String answer = new String();

        for (int userInput = 0;userInput <= 5; userInput++) {


             userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("student 1");
                    System.out.println("A");

                    break;
                case 2:
                    System.out.println("sudent 2");
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("student 3");
                    System.out.println("B");
                    break;
                case 4:
                    System.out.println("student 4");
                    System.out.println("A");
                    break;
                case 5:
                    System.out.println("student 5");
                    System.out.println("B");
                    break;
            }

        }
                System.out.println("A" + " " + A++);
                System.out.println("B" + " " + B++);
                System.out.println("C" + " " + C++);
                System.out.println(" ");
        }

    }

