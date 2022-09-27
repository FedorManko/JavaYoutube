package regex.lesson248numofchar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9A-Z$=.+^-]");
        Matcher matcher = pattern.matcher("a=b.!:$:6A+^-");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group());
            System.out.print("||");
        }
        System.out.println();
        Pattern pattern1 = Pattern.compile("gr[ae]y");
        Matcher matcher1 = pattern1.matcher("grey");
        while (matcher1.find()) {
            System.out.print(matcher1.start() + " " + matcher1.group());
            System.out.print("||");

        }
        System.out.println();
        Pattern pattern2 = Pattern.compile("f[^a]");
        Matcher matcher2 = pattern2.matcher("foka");
        while (matcher2.find()) {
            System.out.print(matcher2.start() + " " + matcher2.group());
            System.out.print("||");

        }
        System.out.println();
        Pattern pattern3 = Pattern.compile("[]ax^-]");
        Matcher matcher3 = pattern3.matcher("fo^]ka-");
        while (matcher3.find()) {
            System.out.print(matcher3.start() + " " + matcher3.group());
            System.out.print("||");

        }
        System.out.println();
        Pattern pattern4 = Pattern.compile("\\\\");
        Matcher matcher4 = pattern4.matcher("\\\\");
        while (matcher4.find()) {
            System.out.print(matcher4.start() + " " + matcher4.group());
            System.out.print("||");

        }
        System.out.println();
        Pattern pattern5 = Pattern.compile("\\Q]\\E");
        Matcher matcher5 = pattern5.matcher("]");
        while (matcher5.find()) {
            System.out.print(matcher5.start() + " " + matcher5.group());
            System.out.print("||");

        }
        System.out.println();
        Pattern pattern6 = Pattern.compile("\\s\\d");//\\d\\s\\w\\D
        Matcher matcher6 = pattern6.matcher("a509 0d 8d");
        while (matcher6.find()) {
            System.out.print(matcher6.start() + " " + matcher6.group());
            System.out.print("||");

        }
    }
}
