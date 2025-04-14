class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int temperature;
    private int previousTemp;

    public SetThermostatCommand(Thermostat thermostat, int temp) {
        this.thermostat = thermostat;
        this.temperature = temp;
    }

    @Override
    public void execute() {
        previousTemp = thermostat.currentTemperature;
        thermostat.setTemperature(temperature);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(previousTemp);
    }
}
