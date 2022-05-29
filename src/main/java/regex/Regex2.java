package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String sq = "AB CD  ABCE ABCGABC8G OOKJVXCDY";
        Pattern pattern1 = Pattern.compile("\\w+");
        Matcher matcher = pattern1.matcher(sq);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " -> " + matcher.group());
        }
     }
}
