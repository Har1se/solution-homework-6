class SetThermostatCommand implements Command {
    private final Thermostat thermostat;
    private final int targetTemperature;
    private int previousTemperature;

    public SetThermostatCommand(Thermostat thermostat, int targetTemperature) {
        this.thermostat = thermostat;
        this.targetTemperature = targetTemperature;
        this.previousTemperature = thermostat.getCurrentTemperature();
    }

    @Override
    public void execute() {
        thermostat.setTemperature(targetTemperature);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(previousTemperature);
    }
}
