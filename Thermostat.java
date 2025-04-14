class Thermostat{
    private int currentTemperature = 20;
    private int previousTemperature;

    public void setTemperature(int temp){
        previousTemperature = currentTemperature;
        currentTemperature = temp;
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C");
    }
    public void revert(){
        int temp = currentTemperature;
        currentTemperature = previousTemperature;
        previousTemperature = temp;
        System.out.println("[Thermostat] Reverting to previous temperature: " + currentTemperature + "°C");
    }
}