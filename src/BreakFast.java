import java.util.Random;

public class BreakFast {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        Random random = new Random();
        int max = 0;
        int min = 0;
        int sum = 0;
        int product = 1;


        for (int i = 1; i < 10; i++)
            number[i] = i + 1;

            for (int i = 1; i < 10; i++)

            System.out.print(number[i] + " ");


            for ( int i = 1; i < 10; i++) {
            number[i] = i + 1;
                min = Math.min(i, min);
                System.out.println("the minimum number is" + " " + min);
                max = Math.max(i, max);
                System.out.println("the maximum number is " + " " + max);

                sum += i;
                System.out.println("the sum is "+ " " + sum);

                product *= i;

                System.out.println("the product is" + " " + product);


//
//                for (i = 0; i < 10; i++)
//             number[i] = i + 1;
//                max = Math.max(i, max);
//                System.out.println("the maximum number is " + " " + max);
//
//
//                for (i = 0; i < 10; i++)
//                    number[i] = i + 1;
//                sum = i + i;
//                System.out.println("the sum is "+ " " + sum);
//
//                product = i / i;
//                System.out.println("the product is" + " " + product);
//

            }


        }
    }












