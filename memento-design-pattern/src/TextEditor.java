// Originator
public class TextEditor {
    private String content;

    public void write(String text) {
        content = text;
    }

    public String getContent() {
        return content;
    }

    // Save state
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    // Restore state
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }
}
