import java.util.Scanner;

    public class Meyer {
        private static Scanner input = new Scanner(System.in);
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            String userInput = scanner.nextLine();
            int extrovert = 0;
            int introvert = 0;
            int sensing = 0;
            int intuitve = 0;
            int thinking = 0;
            int feeling = 0;
            int judging = 0;
            int preceiving = 0;

            String answer;
            for (int i = 1; i <= 20; i++) {
                switch (i) {
                    case 1:
                        System.out.println("""
                                1.
                                A. Expand energy, Enjoy groups
                                B.conserve energy , enjoy one on one
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) extrovert++;
                        else introvert++;
                        break;

                    case 2: {
                        System.out.println("""
                                2.
                                A.  interpret literally
                                B.  look for meaning and possibilities                          
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) sensing++;
                        else intuitve++;
                        break;
                    }
                    case 3:
                        System.out.println("""
                                3.
                                A. logical,thinking,questioning
                                B. empathetic,feeling,accommodating
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) thinking++;
                        else feeling++;
                        break;

                    case 4:
                        System.out.println("""
                                4.
                                A. organized,orderly
                                B. flexible,adaptable
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) judging++;
                        else preceiving++;
                        break;


                    case 5:
                        System.out.println("""
                                5.
                                A. more outgoing,think out loud
                                B. more reserved, think to yourself
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) extrovert++;
                        else introvert++;
                        break;

                    case 6:
                        System.out.println("""
                                6.
                                A. pratical,realistic,experiential
                                B. imgaginative,innovative,theoretical
                                """);
                        answer = input.nextLine();
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) sensing++;
                        else intuitve++;
                        break;

                    case 7:
                        System.out.println("""
                                7.
                                A. candid,straight forward,frank
                                B. tactful,kind,encourage
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) thinking++;
                        else feeling++;
                        break;

                    case 8:
                        System.out.println("""
                                8.
                                A. plan ,schedule
                                B. unplanned ,spontaneous
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) judging++;
                        else preceiving++;
                        break;


                    case 9:
                        System.out.println("""
                                9.
                                A. seek many tasks,public activities,interaction with others
                                B. seek private, solitary activities with quiet to concentrate
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) extrovert++;
                        else introvert++;
                        break;

                    case 10: {
                        System.out.println("""
                                10.
                                A.  standard ,usual,conventional
                                B.  different,novel,unique                        
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) sensing++;
                        else intuitve++;
                        break;
                    }
                    case 11:
                        System.out.println("""
                                11.
                                A. firm,tend to criticize,hold the line
                                B. gentle,tend to appreciate,conciliate
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) thinking++;
                        else feeling++;
                        break;

                    case 12:
                        System.out.println("""
                                12.
                                A. regulated,structured
                                B. easygoing,"live" and "let live"
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) judging++;
                        else preceiving++;
                        break;


                    case 13:
                        System.out.println("""
                                13.
                                A. external,communicative,express yourself
                                B. internal,reticent,keep to yourself
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) extrovert++;
                        else introvert++;
                        break;

                    case 14: {
                        System.out.println("""
                                14.
                                A.  focus on here-and-now
                                B.  look to the future,global perspective,"big picture"                    
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) sensing++;
                        else intuitve++;
                        break;
                    }
                    case 15:
                        System.out.println("""
                                15.
                                A. tough-minded,just
                                B. tender-hearted,merciful
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) thinking++;
                        else feeling++;
                        break;

                    case 16:
                        System.out.println("""
                                16.
                                A. preparation,plan ahead
                                B. go with the flow,adapt as you go
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) judging++;
                        else preceiving++;
                        break;


                    case 17:
                        System.out.println("""
                                17.
                                A. active,initiate
                                B. reflective,deliberate
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) extrovert++;
                        else introvert++;
                        break;

                    case 18: {
                        System.out.println("""
                                18.
                                A. fact,things,"what is," 
                                B. ideas,dreams,"what could be,"philosophical                        
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) sensing++;
                        else intuitve++;
                        break;
                    }
                    case 19:
                        System.out.println("""
                                19.
                                A. matter of fact, issue-oriented
                                B. sensitive,people-oriented,compassionate
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) thinking++;
                        else feeling++;
                        break;

                    case 20:
                        System.out.println("""
                                20.
                                A. control,govern
                                B. latitude,freedom
                                """);
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("A")) judging++;
                        else preceiving++;
                        break;

                }
            }
            System.out.println("extrovert" + " " + extrovert++);
            System.out.println("introvert" + " " + introvert++);
            System.out.println("sensing" + " " + sensing++);
            System.out.println("intuitive" + " " + intuitve++);
            System.out.println("thinking" + " " + thinking++);
            System.out.println("feeling"+ " " + feeling++);
            System.out.println("judging" + " " + judging++);
            System.out.println("preceiving" + " " + preceiving++);
            System.out.println(" ");


            if(extrovert > introvert)
                System.out.println("extrovert");
            else
                System.out.print("introvert");
            if(sensing > intuitve)
                System.out.println("sensing");
            else
                System.out.print("intuitive");
            if(thinking > feeling)
                System.out.println("thinking");
            else
                System.out.print("feeling");
            if(judging > preceiving)
                System.out.println("judging");
            else
                System.out.print("preceiving");

        }
    }
