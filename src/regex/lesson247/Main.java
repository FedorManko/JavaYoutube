package regex.lesson247;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ank");
        Matcher matcher = p.matcher("Fedor Manko");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
        Pattern p1 = Pattern.compile("1\\+1=2");
        Matcher matcher1 = p1.matcher("1+1=2");
        while (matcher1.find()){
            System.out.println(matcher1.start() + " " + matcher1.group() + " ");
        }
        System.out.println();
        Pattern p2 = Pattern.compile("\\Q1*3=3\\E");
        Matcher matcher2 = p2.matcher("1*3=3");
        while (matcher2.find()){
            System.out.println(matcher2.start() + " " + matcher2.group() + " ");
        }
        System.out.println();
        Pattern p3 = Pattern.compile("cat");
        Matcher matcher3 = p3.matcher("He captured a catfish for his cat");
        while (matcher3.find()){
            System.out.println(matcher3.start() + " " + matcher3.group() + " ");
        }
    }
}
