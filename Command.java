import java.util.Stack;
import java.util.HashMap;
import java.util.Map;


interface Command {
    void execute();
    void undo();
}