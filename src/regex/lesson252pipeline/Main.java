package regex.lesson252pipeline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("cat|dog");
        Matcher matcher = pattern.matcher("cat dog");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
