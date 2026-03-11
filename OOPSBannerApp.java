import java.util.*;

public class OOPSBannerApp {

    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        List<CharacterPattern> patterns = new ArrayList<>();

        patterns.add(new CharacterPattern('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        }));

        patterns.add(new CharacterPattern('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        }));

        patterns.add(new CharacterPattern('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        }));

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                for (CharacterPattern cp : patterns) {

                    if (cp.getCharacter() == c) {
                        line.append(cp.getPattern()[row]).append("   ");
                    }

                }

            }

            System.out.println(line.toString());
        }
    }
}