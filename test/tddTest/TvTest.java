package tddTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TvTest {
    @Test
   public void toCreateATelevisionTest() {
        Tv thug = new Tv();
        assertNotNull(thug);
    }

    @Test
   public void toTurnOnTheTelevisionTest() {
        Tv thug = new Tv();
        thug.switchOn();
        assertEquals(true, thug.isOn());
    }

    @Test
   public void toTurnOffTheTelevisionTest() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.switchOff();
        assertEquals(true, thug.isOn ());
    }

    @Test
   public void toIncreaseChannels() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.increaseChannel();
        assertEquals(1, thug.getChannel());
    }

    @Test
   public  void toDecreaseChannels() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.increaseChannel();
        thug.decreaseChanel();
        assertEquals(0, thug.getChannel());
    }

    @Test
    public void toSwitchChannel() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.changeChannel(25);
        assertEquals(25, thug.getChannel());
    }

    @Test
    public void increaseVolumeTest() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.increaseVolume();
        assertEquals(1, thug.getVolume());
    }

    @Test
    public void decreaseVolumeTest() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.decreaseVolume();
        assertEquals(1, thug.getVolume());
    }

    @Test
    public void limitTheHighestChannelTo40() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        thug.increaseChannel();
        assertEquals(40, thug.getChannel());
    }

    @Test
   public void channelCannotGoBelow0() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.increaseChannel();
        thug.decreaseChanel();
        thug.decreaseChanel();
        assertEquals(0, thug.getChannel());
    }

    @Test
   public void volumeCannotGoBelowLimit() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.decreaseVolume();
        thug.decreaseVolume();
        thug.decreaseVolume();
        assertEquals(0, thug.getVolume());
    }

    @Test
   public void volumeCannotGoAboveLimit() {
        Tv thug = new Tv();
        thug.switchOn();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        thug.increaseVolume();
        assertEquals(40, thug.getVolume());

    }
}