public class GlyphCharacter  implements CharacterFlyweight {
    private final char symbol;  // intrinsic state

    public GlyphCharacter (char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(int x, int y) { // extrinsic state
        System.out.println(
                "Character '" + symbol + "' displayed at (" + x + ", " + y + ")"
        );
    }
}
