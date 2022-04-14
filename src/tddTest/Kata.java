package tddTest;

public class Kata {
    int totalPrice;


    public int enterNumberOfCopies(int numberOfCopies) {
        if (numberOfCopies > 0 && numberOfCopies < 4) {
            totalPrice = numberOfCopies * 2000;
        } else if (numberOfCopies > 5 && numberOfCopies < 9) {
            totalPrice = numberOfCopies * 1800;
        } else if (numberOfCopies > 10 && numberOfCopies < 29) {
            totalPrice = numberOfCopies * 1600;
        } else if (numberOfCopies > 30 && numberOfCopies < 49) {
            totalPrice = numberOfCopies * 1500;
        } else if (numberOfCopies > 50 && numberOfCopies < 99) {
            totalPrice = numberOfCopies * 1300;
        } else if (numberOfCopies > 100 && numberOfCopies < 199) {
            totalPrice = numberOfCopies * 1200;
        } else if (numberOfCopies > 200 && numberOfCopies < 499) {
            totalPrice = numberOfCopies * 1100;
        } else if (numberOfCopies >= 500) {
            totalPrice = numberOfCopies * 1000;
        }return totalPrice;
    }
}