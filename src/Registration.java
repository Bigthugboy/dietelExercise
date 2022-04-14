import java.util.Scanner;

public class Registration {
    public String setPassword;
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("""
                Hello my people,
                Enter:
                1-> register
                2 -> login
                3 -> logout
                """);
        int userInput = Scanner.nextInt();
        switch (userInput) {

            case 1: {
                System.out.println("""
                        enter first name
                        enter last name
                        create password
                        re-enter password
                        """);
                int create = Scanner.nextInt();
                switch (userInput) {
                    case 1:

                        System.out.println("enter first name");
                        Scanner.nextInt();
                        break;

                    case 2:
                        System.out.println("enter last name");
                        Scanner.nextInt();
                        break;


                    case 3:
                        System.out.println("create password");
                        Scanner.nextInt();
                        break;


                    case 4:
                        System.out.println("re-enter password");



                }
            }
                break;


                case 2: {
                    System.out.println("Enter your name");
                    Scanner.next();
                    System.out.println("Enter your password");
                    Scanner.next();
                    System.out.println("logged in");
                    Scanner.next();
                    System.out.println("\n".repeat(5));
                    Scanner.next();


                }
                case 3: {
                    System.out.println("enter password");
                    Scanner.next();
                    System.out.println("save loggin details");
                    Scanner.next();
                    System.out.println("saved");
                    Scanner.next();
                }
            }
        }
    }

