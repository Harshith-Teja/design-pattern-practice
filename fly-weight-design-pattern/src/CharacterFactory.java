import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<Character, CharacterFlyweight> cache = new HashMap<>();

    public static CharacterFlyweight getCharacter(char c) {
        if (!cache.containsKey(c)) {
            cache.put(c, new GlyphCharacter (c));
            System.out.println("Creating new character: " + c);
        }
        return cache.get(c);
    }
}
