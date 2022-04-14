public class Numbers {
    public static void main(String[] args) {
        int[] number = new int[20];

        int i;
        for (i = 0; i < 20; i++) {

            number[i] = i + 1;
        }


        for (i = 0; i < 20; i++)


            if (i % 2 != 0)


                System.out.println(number[i] + " " + "even number");
            else
                System.out.println(number[i] + " " + "odd number");





    }
}

