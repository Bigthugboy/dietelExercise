package tddTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
   public void acCanBeCreated() {
        AirConditioner aC = new AirConditioner();
        assertNotNull(aC);


    }

    @Test
    public void turnOnAc() {
        AirConditioner aC = new AirConditioner();
        aC.setSwitch();
        Assertions.assertEquals(true, aC.OnAc());
    }

    @Test
    public void turnOffAc() {
        AirConditioner aC = new AirConditioner();
        aC.setSwitch();
        Assertions.assertEquals(true, aC.OffAc());

    }

    @Test
    public void increaseAcTemperature() {
        AirConditioner aC = new AirConditioner();
        aC.setSwitch();
        aC.increaseAcTemperature();
        Assertions.assertEquals(16+1, aC.increaseAcTemperature());
    }

    @Test
    public void decreaseAcTemperature() {
        AirConditioner aC = new AirConditioner();
        aC.setSwitch();
        aC.increaseAcTemperature();
        aC.decreaseAcTemperature();
        Assertions.assertEquals(17-1, aC.decreaseAcTemperature());
    }
    @Test
    public void increaseAcBeyond30() {
        AirConditioner aC = new AirConditioner();
        aC.setSwitch();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        aC.increaseAcTemperature();
        Assertions.assertEquals(30, aC.increaseAcBeyond30());
    }
    @Test
    public void decreaseAcBeyond16(){
        AirConditioner aC = new AirConditioner();
        aC.setSwitch();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        aC.decreaseAcTemperature();
        Assertions.assertEquals(16 , aC.decreaseAcBeyond30());


    }

}
