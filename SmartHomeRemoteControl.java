import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

class SmartHomeRemoteControl {
    private Map<Integer, Command> slots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(int slot, Command command) {
        slots.put(slot, command);
    }

    public void pressButton(int slot) {
        if (slots.containsKey(slot)) {
            Command cmd = slots.get(slot);
            cmd.execute();
            history.push(cmd);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command cmd = history.pop();
            cmd.undo();
        }
    }
}
