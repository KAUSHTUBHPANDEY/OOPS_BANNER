public class OOPSBANNERUC7 {

    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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

    public static CharacterPatternMap createO() {
        return new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });
    }

    public static CharacterPatternMap createP() {
        return new CharacterPatternMap('P', new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        });
    }

    public static CharacterPatternMap createS() {
        return new CharacterPatternMap('S', new String[]{
                "  ****** ",
                " **      ",
                "**       ",
                "  *****  ",
                "       **",
                " **    **",
                "  ****** "
        });
    }

    public static void main(String[] args) {

        CharacterPatternMap[] characters = {
                createO(),
                createO(),
                createP(),
                createS()
        };

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cp : characters) {
                line.append(cp.getPattern()[i]).append(" ");
            }
            System.out.println(line.toString());
        }
    }
}