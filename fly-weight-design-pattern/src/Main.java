public class Main {
    public static void main(String[] args) {
        String text = "hello";

        int x = 0;
        for (char c : text.toCharArray()) {
            CharacterFlyweight character =
                    CharacterFactory.getCharacter(c);
            character.display(x++, 0);
        }
    }

}