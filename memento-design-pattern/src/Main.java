public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello");
        history.save(editor.save());

        editor.write("Hello World");
        history.save(editor.save());

        editor.write("Hello World!!!");
        System.out.println("Current: " + editor.getContent());

        // Undo
        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getContent());

        editor.restore(history.undo());
        System.out.println("After second undo: " + editor.getContent());
    }
}