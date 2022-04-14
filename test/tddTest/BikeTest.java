package tddTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BikeTest {
    @Test
    public void bikeCanBeCreated() {
        Bike cE = new Bike();
        assertNotNull(cE);
    }

    @Test
    public void isOn() {
        Bike cE = new Bike();
        cE.setSwitch();
        assertEquals(true, cE.isOn());
    }

    @Test
    public void bikeAccelerationUp() {
        Bike cE = new Bike();
        cE.setSwitch();
        cE.accelerate();
        assertEquals(1, cE.getspeed());
    }

    @Test
    public void bikeAcceleration() {
        Bike cE = new Bike();
        cE.setSwitch();
        cE.accelerate();
        cE.Gear();
        assertEquals(1, cE.getGear());
    }

    @Test
    public void bikeCanSpeed() {
        Bike cE = new Bike();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();

        assertEquals(16, cE.getspeed());
    }

    @Test
    public void bikeCanSpeedUpTo22() {
        Bike cE = new Bike();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();

        assertEquals(22, cE.getspeed());
    }

    @Test
    public void bikeCanSpeedUpTo33() {
        Bike cE = new Bike();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        assertEquals(33, cE.getspeed());
    }

    @Test
    public void bikeCanSpeedUp() {
        Bike cE = new Bike();
        cE.getGear();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        cE.accelerate();
        assertEquals(15, cE.getspeed());
    }


    @Test
    public void bikeCanDeccelerate() {
        Bike cE = new Bike();
        cE.setSwitch();

        cE.deccelerate();
        assertEquals(1, cE.getspeed());
    }
}
//    @Test
//    public void bikeCanDecceleratedown() {
//        Bike cE = new Bike();
//        cE.setSwitch();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.deccelerate();
//        assertEquals(10, cE.getspeed());
//    }
//





