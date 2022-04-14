import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[300];

        for (int i = 0; i < 300; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < 300; i++) {
            System.out.print(Arrays.toString(numbers));
        }


        }

    }

