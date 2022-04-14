package tddTest;

public class Tv {
    private boolean remote;
    int channel = 0;
    int volume = 0;

    public void switchOn() {
        if (remote) {
            remote = false;
        } else {
            remote = true;
        }
    }

    public boolean isOn() {
        return remote;
    }

    public void switchOff() {
        if (remote) {
            remote = true;
        } else {
            remote = false;
        }
    }

    public void increaseChannel() {
        if (channel < 40) {
            channel = channel + 1;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void decreaseChanel() {
        if (channel > 0) {
            channel = channel - 1;
        } else {
            System.out.print("Channel cannot go below 0");
        }
    }

    public int changeChannel(int number) {
        channel = number;
        {
            return number;
        }
    }

    public void increaseVolume() {
        if (volume < 40) {
            volume = volume + 1;
        } else {
            System.out.print("Volume cannot go below 0 ");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        } else {
            System.out.print("Volume cannot go below 0 ");

        }

    }
}