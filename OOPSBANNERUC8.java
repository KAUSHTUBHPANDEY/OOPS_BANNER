import java.util.HashMap;
import java.util.Map;

public class OOPSBANNERUC8 {

    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });

        map.put('P', new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        });

        map.put('S', new String[]{
                "  ****** ",
                " **      ",
                "**       ",
                "  *****  ",
                "       **",
                " **    **",
                "  ****** "
        });

        return map;
    }

    public static void renderBanner(String message, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[i]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();
        renderBanner("OOPS", characterMap);
    }
}