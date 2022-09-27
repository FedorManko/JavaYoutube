package regex.lesson249dot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{2}.\\d*[- ./]\\d*");
        Matcher matcher = pattern.matcher("02-12 03");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
        System.out.println();
        Pattern pattern1 = Pattern.compile("\".*\"");
        Matcher matcher1 = pattern1.matcher("\"fedor\" \"manko\"");
        while (matcher1.find()){
            System.out.println(matcher1.start() + " " + matcher1.group());
        }
        System.out.println();
        Pattern pattern2 = Pattern.compile("\".*?\"");
        Matcher matcher2 = pattern2.matcher("\"fedor\" \"manko\"");
        while (matcher2.find()){
            System.out.println(matcher2.start() + " " + matcher2.group());
        }
        System.out.println();
        Pattern pattern3 = Pattern.compile("\"[^\"\n\r]*\"");
        Matcher matcher3 = pattern3.matcher("\"fedor\" \"manko\"");
        while (matcher3.find()){
            System.out.println(matcher3.start() + " " + matcher3.group());
        }
        System.out.println();

    }
}
