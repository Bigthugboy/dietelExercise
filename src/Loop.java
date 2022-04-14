import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        for(; count <= 100;){
            System.out.println("enter a score or enter a score more than 100 to exit");
            count = scanner.nextInt();
            System.out.println("collected");
        }
    }
}
