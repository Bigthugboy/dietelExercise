import java.util.Scanner;

public class MyNokia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1 -> phonebook
                2 -> message
                3 -> chat
                4 -> call register
                5 -> tones
                6 -> settings
                7 -> call divert
                8 -> games
                9 -> calculator
                10 -> reminder
                11 -> clock
                12 ->profile
                13 -> sim services
                """);
        int userInput = scanner.nextInt();
        switch (userInput) {

            case 1:
                System.out.println("""
                        1. search
                        2. Service Nos
                        3. Add name
                        4. erase
                        5. edit
                        6. assign tone
                        7. send b'card
                        8.options
                        9. speed dials
                        10. voice tags    
                        """);


                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Search");

                    case 2:
                        System.out.println("Service Nos");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("erase");
                        break;
                    case 5:
                        System.out.println("edit");
                        break;
                    case 6:
                        System.out.println("assign tone");
                        break;
                    case 7:
                        System.out.println("send b'card");
                        break;
                    case 8:
                        System.out.println("option");
                        System.out.println("""
                                1. type of view
                                2. memory status
                                """);


                        input = scanner.nextInt();
                        switch (input) {

                            case 1:
                                System.out.println("type of view");
                                break;
                            case 2:
                                System.out.println("memory status");

                                break;
                        }


                        break;
                    case 9:
                        System.out.println("speed dials");
                        break;
                    case 10:
                        System.out.println("voice tags");
                        break;
                }

                break;


            case 2:
                System.out.println("""
                                1.write message
                                2.indox
                                3. outbox
                                4. picture message
                                5. template
                                6. smileys
                                7. message settings
                                8. message
                        """);
                int messageenter = scanner.nextInt();
                switch (messageenter) {


                    case 1:
                        System.out.println("write messages");
                        break;
                    case 2:
                        System.out.println("inbox");
                        break;
                    case 3:
                        System.out.println("outbox");
                        break;
                    case 4:
                        System.out.println("picture messages");
                        break;
                    case 5:
                        System.out.println("templates");
                        break;
                    case 6:
                        System.out.println("smileys");
                        break;
                    case 7:
                        System.out.println("message settings");
                        System.out.println("""
                                1. set
                                2. common
                                """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("""
                                        1. message centre number
                                        2. message sent as
                                        3. message validity
                                        """);

                                input = scanner.nextInt();
                                switch (input) {
                                    case 1:
                                        System.out.println("message centre number");
                                        break;
                                    case 2:
                                        System.out.println("message sent as");
                                        break;
                                    case 3:
                                        System.out.println("message validity");
                                        break;
                                }
                                break;

                            case 2:
                                System.out.println("""
                                        1. delivery report
                                        2.reply via same centre
                                        3. character support
                                        4. info service
                                        5. voice mailbox number
                                        6. service command
                                        """);
                                input = scanner.nextInt();
                                switch (input) {
                                    case 1:
                                        System.out.println("delivery report");
                                        break;
                                    case 2:
                                        System.out.println("reply via same centre");
                                        break;
                                    case 3:
                                        System.out.println("character support");
                                        break;
                                    case 4:
                                        System.out.println("info service");
                                        break;
                                    case 5:
                                        System.out.println("voice mailbox number");
                                        break;
                                    case 6:
                                        System.out.println("service command");
                                        break;
                                }
                                break;
                        }
                        break;

                }
            case 3: {
                System.out.println("chat");
                scanner.next();
            }
            break;


            case 4:
                System.out.println("call register");
                System.out.println("""
                        1. missed calls
                        2. receive numbers
                        3. dialled numbers
                        4. erase recent call list
                        5.show call durations
                        6. show call cost
                        7. call cost settings
                        8. prepaid credit
                        """);

                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("missed calls");
                        break;
                    case 2:
                        System.out.println("receive numbers");
                        break;
                    case 3:
                        System.out.println("dialled numbers");
                        break;
                    case 4:
                        System.out.println("erase reent call list");
                        break;
                    case 5:
                        System.out.println("show call durations");
                        System.out.println("""
                                1. last call durations
                                2. all call durations
                                3. receive call's durations
                                4. dialled call's durations
                                5. clear times
                                """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("last call durations");
                                break;
                            case 2:
                                System.out.println("all call durations");
                                break;
                            case 3:
                                System.out.println("receive call's durations");
                                break;
                            case 4:
                                System.out.println("dialled call's durations");
                                break;
                            case 5:
                                System.out.println("clear timers");
                                break;
                        }
                        break;


                    case 6:

                        System.out.println("""
                                1. last call cost
                                2. all call cost
                                3. clear counters
                                 """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("last call cost");
                                break;
                            case 2:
                                System.out.println("all call cost");
                                break;
                            case 3:
                                System.out.println("clear counters");
                                break;
                        }
                        break;


                    case 7:
                        System.out.println("""
                                1.  call cost settings
                                2. show cost in
                                """);
                        input = scanner.nextInt();
                        switch (input) {

                            case 1:
                                System.out.println("call cost limit");
                                break;
                            case 2:
                                System.out.println("show cost in");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("prepaid credit");
                        break;
                }
                break;

            case 5:
                System.out.println("tone");
                System.out.println("""
                        1. ringing tone
                        2. ringing volume
                        3. incoming call alert
                        4. composer
                        5. message alert tone
                        6. keypad tones
                        7. warning and games tones
                        8. vibrating alert
                        9. screen saver
                        """);
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("ringing tone");
                        break;
                    case 2:
                        System.out.println("ringing volume");
                        break;
                    case 3:
                        System.out.println("incoming call alert");
                        break;
                    case 4:
                        System.out.println("composer");
                        break;
                    case 5:
                        System.out.println("message alert tone");
                        break;
                    case 6:
                        System.out.println("keypad tones");
                        break;
                    case 7:
                        System.out.println("warning and games tone");
                        break;
                    case 8:
                        System.out.println("vibrating alert");
                        break;
                    case 9:
                        System.out.println("screen saver");

                        break;
                }


            case 6:
                System.out.println("settings");
                System.out.println("""
                        1. call settings
                        2. phone settings
                        3. security settings
                        4. restore factory settings
                            """);
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        ;
                        System.out.println("call settings");
                        System.out.println("""
                                1. automatic redial
                                2. speed dialling
                                3. calling waiting options
                                4. own number sending
                                5. phone line in use
                                6. automatic answer
                                          """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("automatic redial");
                                break;
                            case 2:
                                System.out.println("speed dialling");
                                break;
                            case 3:
                                System.out.println("calling waiting options");
                                break;
                            case 4:
                                System.out.println("own number sending");
                                break;
                            case 5:
                                System.out.println("phone line in use");
                                break;
                            case 6:
                                System.out.println("automatic answer");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("phone settings");
                        System.out.println("""
                                1.language
                                2. cell info display
                                3. welcome note
                                4. network selection
                                5. lights
                                6. confirm SIM service actions
                                        """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:

                                System.out.println("language");
                                break;
                            case 2:
                                System.out.println("cell info display");
                                break;
                            case 3:
                                System.out.println("welcome note");
                                break;
                            case 4:
                                System.out.println("network selections");
                                break;
                            case 5:
                                System.out.println("lights");
                                break;
                            case 6:
                                System.out.println("confirm SIM service actions");
                                break;
                        }

                        break;

                    case 3:
                        System.out.println("security settings");
                        System.out.println("""
                                1. pin code request
                                2. call barring service
                                3. fixed dialling
                                4. closed user group
                                5. phone security
                                6. change access codes
                                """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:

                                System.out.println("PIN code request");
                                break;
                            case 2:
                                System.out.println("call barring services");
                                break;
                            case 3:
                                System.out.println("fixed dialling");
                                break;
                            case 4:
                                System.out.println("closed user group");
                                break;
                            case 5:
                                System.out.println("phone security");
                                break;
                            case 6:
                                System.out.println("change access codes");
                                break;
                        }
                        break;

                    case 4:
                        System.out.println("restore factory settings");
                        break;
                }

                break;
            case 7:
                System.out.println("call divert");
                break;

            case 8:
                System.out.println("games");
                break;

            case 9:
                System.out.println("calculator");
                break;

            case 10:
                System.out.println("reminder");
                break;

            case 11:
                System.out.println("clock");
                System.out.println("""
                        1. alarm clock
                        2. clock settings
                        3. date settings
                        4. stopwatch
                        5. countdown timer
                        6. auto update of date and time
                        """);
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("alarm clock");
                        break;
                    case 2:
                        System.out.println("clock settings");
                        break;
                    case 3:
                        System.out.println("date settings");
                        break;
                    case 4:
                        System.out.println("stopwatch");
                        break;
                    case 5:
                        System.out.println("countdown timer");
                        break;
                    case 6:
                        System.out.println("auto update of date and time");
                        break;
                }
                break;


            case 12:
                System.out.println("profile");
                break;

            case 13:
                System.out.println("SIM services");
                break;

        }

    }
}












