package regex.lesson250bstartend;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\bbird\\b");
        Matcher matcher = pattern.matcher("Foka bird isbird");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
        System.out.println();
        Pattern pattern1 = Pattern.compile("d$");
        Matcher matcher1 = pattern1.matcher("bFoka bus bird isbird");
        while (matcher1.find()){
            System.out.println(matcher1.start() + " " + matcher1.group());
        }
        System.out.println();
        Pattern pattern2 = Pattern.compile("^F");
        Matcher matcher2 = pattern2.matcher("Foka bus bird isbird");
        while (matcher2.find()){
            System.out.println(matcher2.start() + " " + matcher2.group());
        }
        System.out.println();
        Pattern pattern3 = Pattern.compile("\\A\\d+\\Z");
        Matcher matcher3 = pattern3.matcher("2343");
        while (matcher3.find()){
            System.out.println(matcher3.start() + " " + matcher3.group());
        }
        System.out.println();
        Pattern pattern4 = Pattern.compile("ne$", Pattern.MULTILINE);
        Matcher matcher4 = pattern4.matcher("first line\nsecond line");
        while (matcher4.find()){
            System.out.println(matcher4.start() + " " + matcher4.group());
        }
        System.out.println();
        System.out.println("4".matches("^4$"));
    }

}
