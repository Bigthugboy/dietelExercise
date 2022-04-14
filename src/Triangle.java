public class Triangle {

    public static void main(String[] args) {

        int i;
        for (i = 1; i <= 5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for (int number  = 5; number >= 0; number--) {
             for (int j = 0; number > j; j++) {
                 System.out.println("*");
             }
             System.out.println("");
        }
        int j = 0;

    }
}
