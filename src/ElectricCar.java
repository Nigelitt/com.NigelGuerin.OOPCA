public class ElectricCar extends Car {
    private int batterySize;
    private String Motor;


    @Override
    public String toString() {
        return "ElectricCar" +
                "BatterySize: " + batterySize + '\n' +
                "Motor: " + Motor ;
    }

    public ElectricCar(int batterySize, String motor) {
        this.batterySize = batterySize;
        Motor = motor;

    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }


}
