package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "" +
                "Состоят только из букв\n" +
                "Одна и только одна из букв является заглавной" +
                "Пример строк которые могут быть выделены варажением: " +
                "Мама авТо гриБ Яблоко, яБлоко, ябЛоко, яблОко, яблоКо, яблокО " +

                "Пример строк которые не должны быть выделены выражением: " +
                "агент007 - содержит цифры " +
                "стриж - только строчные буквы" +
                " ГТО, - более одной заглавной буквы " +
                "Три богатыря - содержит пробел, допустимы только буквы.";
//(А-я|а-я)
       // Pattern pattern = Pattern.compile("\\D[А-Я{1}а-я]+");
        Pattern pattern = Pattern.compile("[А-Я{1}а-я]+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }



    }
}
