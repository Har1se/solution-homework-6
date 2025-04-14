public class CommandPatternDemo {
    public static void main(String[] args) {
        // Создаем устройства
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();

        // Создаем команды
        Command lightOn = new TurnOnLightCommand(livingRoomLight);
        Command setTemp22 = new SetThermostatCommand(thermostat, 22);

        // Макрокоманда для ночного режима
        Command nightMode = new NightModeCommand(
                new TurnOnLightCommand(livingRoomLight),
                new SetThermostatCommand(thermostat, 18)
        );

        // Настраиваем пульт
        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand(1, lightOn);
        remote.setCommand(2, setTemp22);
        remote.setCommand(3, nightMode);

        // Тестируем
        remote.pressButton(1); // Включить свет
        remote.pressButton(2); // Установить температуру
        remote.undoButton();   // Отменить последнюю команду

        System.out.println("\nTesting Night Mode:");
        remote.pressButton(3); // Активировать ночной режим
        remote.undoButton();   // Отменить ночной режим
    }
}
