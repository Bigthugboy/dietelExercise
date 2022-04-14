import java.util.Random;

public class Password {
    public static void main(String[] args) {


        int[] number = new int[9];
        Random word = new Random();

        String lowercase = "abcdefghijklmnopqrstwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String value = uppercase + lowercase + number;
        int len = 12;
        char[] password = new char[12];


        for (int j = 0; j <len;  j++)
            password[j] = value.charAt(word.nextInt(value.length()));

System.out.print("use password:" +  new String(password));
    }
}
