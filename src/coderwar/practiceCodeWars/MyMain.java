package coderwar.practiceCodeWars;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MyMain {
    public static final char EVEN = '*';
    public static final char ODD = '-';
    public static void main(String[] args) {
        String inputNum = inputNum();
        System.out.println(solution(inputNum));
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords2("Hey fellow warriors"));
    }
    private static String solution(String number){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = number.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if(isEven(chars[i],chars[i+1]) && !isZero(chars[i],chars[i+1])){
                stringBuilder.append(chars[i]);
                stringBuilder.append(EVEN);
            } else if(isOdd(chars[i],chars[i+1]) && !isZero(chars[i],chars[i+1])){
                stringBuilder.append(chars[i]);
                stringBuilder.append(ODD);
            } else if(isZero(chars[i],chars[i+1])){
                stringBuilder.append(chars[i]);
            } else if(isNoBothEvenOrOdd(chars[i],chars[i+1])){
                stringBuilder.append(chars[i]);
            }
        }
        stringBuilder.append(chars[chars.length-1]);
        return stringBuilder.toString();
    }
    private static String inputNum(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static boolean isEven(char x, char y){
        return Character.getNumericValue(x) % 2 == 0 && Character.getNumericValue(y) % 2 == 0;
    }
    private static boolean isOdd(char x, char y){
        return Character.getNumericValue(x) % 2 != 0 && Character.getNumericValue(y) % 2 != 0;
    }
    private static boolean isZero(char x, char y){
        return Character.getNumericValue(x) == 0 || Character.getNumericValue(y)  == 0;
    }
    private static boolean isNoBothEvenOrOdd(char x, char y){
        return Character.getNumericValue(x) % 2 != 0 && Character.getNumericValue(y) % 2 == 0
                || Character.getNumericValue(x) % 2 == 0 && Character.getNumericValue(y) % 2 != 0 ;
    }
    public static String spinWords(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length() >=5){
                char[] chars = strings[i].toCharArray();
                char[] newChars = new char[strings[i].length()];
                for (int j = 0; j < chars.length; j++) {
                    newChars[newChars.length-j-1] = chars[j];

                }
                stringBuilder.append(newChars);
                stringBuilder.append(" ");
            } else {
                stringBuilder.append(strings[i]);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
    public static String spinWords2(String sentence) {
        return Arrays.stream(sentence.split(" ")).map(x -> x.length() > 4 ? new StringBuilder(x).reverse().toString(): x).collect(Collectors.joining(" "));
    }
}
