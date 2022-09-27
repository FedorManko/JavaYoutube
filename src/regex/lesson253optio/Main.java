package regex.lesson253optio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("colo[a-b]?r");
        Matcher matcher = pattern.matcher("color colobr");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
        Pattern pattern1 = Pattern.compile("Nov(ember)??");
        Matcher matcher1 = pattern1.matcher("Nov November");
        while (matcher1.find()){
            System.out.println(matcher1.start() + " " + matcher1.group());
        }
        Pattern pattern2 = Pattern.compile("Feb(ruary)? 23(rd)??");
        Matcher matcher2 = pattern2.matcher("February 23 Feb 23rd Feb 23 February 23rd");
        while (matcher2.find()){
            System.out.println(matcher2.start() + " " + matcher2.group());
        }

    }

}
