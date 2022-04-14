package tddTest;

public class Bike {
    public boolean isOn;
    private int speed = 0;
    private int gear = 0;

    public Bike() {
    }


    public void setSwitch() {
    }

    public boolean isOn() {
        return true;
    }

    public void accelerate() {
        if (speed >= 40) {
            speed = speed + 4;
            gear = 4;

        }
        if (speed >= 30 && speed < 40) {
            speed = speed + 3;
            gear = 3;

        }
        if (speed >= 20 && speed < 30) {
            speed = speed + 2;
            gear = 2;

        }
        if (speed >= 0 && speed < 20) {
            speed = speed + 1;
            gear = 1;

        }

    }

    public int getspeed() {
        System.out.print("gear is " + gear);
        return speed;

    }

    public void Gear() {

    }

    public int getGear(){
        return speed;
    }

    public void deccelerate() {

       if (speed >= 40)
         speed = - 4;
           gear = 4;


       if (speed >= 30 && speed < 40)
            speed =-  3;
            gear = 3;


       if (speed >= 20 && speed < 30)
           speed -= 2;
           gear = 2;


        if (speed >= 0 && speed < 20)
            speed = - 1 ;
            gear = 1;

    }

    }
