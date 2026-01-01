import java.util.Stack;

// Caretaker
public class History {
    private Stack<EditorMemento> stack = new Stack<>();

    public void save(EditorMemento memento) {
        stack.push(memento);
    }

    public EditorMemento undo() {
        return stack.pop();
    }
}
