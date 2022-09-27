package task;
import java.util.*;
import java.io.*;
public class Main2 {
    public static String LongestWord(String sen) {
            String [] strings = sen.split(" ");
        System.out.println(Arrays.toString(strings));
        String mainStr = "";
        for (int i = 0; i < strings.length-1; i++) {
            String str = strings[i].replaceAll("\\W|\\d","");
            String str2 = strings[i+1].replaceAll("\\W|\\d","");
            if(str.length() > str2.length() || str.length() == str2.length()){
                mainStr = str;
            } else
                mainStr = str2;
        }
        return mainStr;
        }
    public static String LongestWord2(String sen) {

        return Arrays.stream(sen.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
    }
        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(LongestWord(s.nextLine()));
            System.out.println(LongestWord2("Fedor13 Fokwasdafer5"));
        }

    }

