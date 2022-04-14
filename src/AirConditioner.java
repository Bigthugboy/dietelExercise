public class AirConditioner {

    public int increaseAcTemperature;
    private boolean getTemperature;

    public void setSwitch() {
    }

    public boolean OnAc() {
        return true;
    }


    public boolean OffAc() {
        boolean OffAc = true;
        return OffAc;
    }

    public int increaseAcTemperature() {
        int Temperature = (increaseAcTemperature + 1);
        return 17;
    }


    public int increaseAcBeyond30() {
        int temperature = 31;
        if (temperature > 30) {
            temperature = temperature + 1;
        } else {
            System.out.println("Temperature cannot exceed 30.");
        }
        return 30;
    }


    public int decreaseAcTemperature() {
        int decreaseAcTemperature = - 1;
        int Temperature = (decreaseAcTemperature - 1);
        return 16;
    }


    public int decreaseAcBeyond30() {
        int temperature = 17;
        if (temperature < 16) {
            temperature = temperature + 1;
        } else {
            System.out.println("Temperature cannot exceed 16.");
        }



        return 16;
    }
}





