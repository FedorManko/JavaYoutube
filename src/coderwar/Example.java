package coderwar;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.stream.IntStream.range;

public class Example {
    public static void main(String[] args) {
        // System.out.println(persistence(12014));
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        System.out.println(filterList(List.of(1, 2, "aasf", "1", "123", 123)));
        System.out.println(rowSumOddNumbers(42));
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        System.out.println(areYouPlayingBanjo("Rartin"));
        System.out.println(find_average(new int[]{2, 6, 9}));
        System.out.println(reverseWords1("Fedor   Manko"));
        System.out.println(doubleInteger(10));
        System.out.println(Arrays.toString(digitize(32131)));
        System.out.println(doubleChar("foka"));
        System.out.println(removeExclamationMarks("Hello World!"));
        System.out.println(squareSum(new int[]{1, 2, 2}));
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
        System.out.println(nbYear(1500, 5, 100, 5000));
        System.out.println(number(Arrays.asList("", "", "", "", "")));
        System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
        System.out.println(Arrays.toString(towerBuilder(3)));
        System.out.println(GetSum(1, 0));
        System.out.println(duplicateCount("abcdea"));
        System.out.println(getCount("abracadabra"));
        System.out.println(highAndLow("1 2 -5 6"));
        System.out.println(getXO("ppzz"));
        System.out.println(stripComments("a #b\\nc\\nd $e f g", new String[]{"#", "$"}));
        System.out.println(BracketMatcher("01()01()01()"));
    }

    public static int persistence(long n) {
        long num = n;
        int count = 0;
        while (String.valueOf(num).length() != 1) {
            if (num < 10) {
                return 0;
            } else if (num >= 10) {
                char[] chars = String.valueOf(num).toCharArray();
                long newNum = 1;
                for (int i = 0; i < chars.length; i++) {
                    newNum = newNum * Character.getNumericValue(chars[i]);
                }
                System.out.println(newNum);
                num = newNum;
                count++;
            }
        }
        return count;
    }

    public static int findIt(int[] a) {

        return stream(a).reduce(0, (x, y) -> x ^ y);
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(elem -> elem instanceof Integer).collect(Collectors.toList());
    }

    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5)
            return "Underweight";
        else if (bmi <= 25)
            return "Normal";
        else if (bmi <= 30)
            return "Overweight";
        else if (bmi > 30)
            return "Obese";
        return "";
    }

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }

    public static int sum(List<?> mixed) {
        int sum = 0;
        for (int i = 0; i < mixed.size(); i++) {
            if (mixed.get(i) instanceof String) {
                Integer x = Integer.parseInt((String) mixed.get(i));
                sum += x;
            } else {
                sum += (int) mixed.get(i);
            }
        }
        return sum;
    }

    public static int sum1(List<?> mixed) {
        return mixed.stream().mapToInt(elem -> Integer.parseInt(elem.toString())).sum();
    }

    public static String areYouPlayingBanjo(String name) {
        String str = "";
        if (name.startsWith("R") || name.startsWith("r")) {
            str = name + " plays banjo";
            return str;
        } else
            return name + " does not play banjo";
    }

    public static int sum3(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }

    public static double find_average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }

    public static String reverseWords(final String original) {
        String[] strings = original.split("\s");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            ;
            stringBuilder.append(new StringBuilder().append(strings[i]).reverse().append(" "));
            if (strings[i].equals(" ")) {
                stringBuilder.append(" ").append(" ");
            }
        }
        System.out.println(Arrays.toString(strings));
        return stringBuilder.toString().trim();
    }

    public static String reverseWords1(final String original) {
        return original.trim().isEmpty() ? original : Stream.of(original.split(" ")).
                map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
    }

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return (int) Math.pow(i, 2);
    }

    public static int[] digitize(long n) {
//        String[] str = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
//        int[] integers = new int[str.length];
//        for (int i = 0; i < integers.length; i++) {
//            integers[i] = Integer.parseInt(str[i]);
//        }
//        return integers;
        // return stream(stream(new StringBuilder(String.valueOf(n)).reverse().toString().split("")).mapToInt(Integer::parseInt).toArray()).toArray();
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(Character::getNumericValue).toArray();
    }

    public static int countPassengers(ArrayList<int[]> stops) {
//        int count = 0;
//        for (int i = 0; i < stops.size(); i++) {
//             count+=stops.get(i)[0] - stops.get(i)[1];
//        }
//        return count;
        return stops.stream().mapToInt(x -> x[0] - x[1]).sum();
    }

    public static String getMiddle(String word) {
        String result = "";
        char[] c;
        if (word.length() % 2 == 0) {
            c = word.toCharArray();
            result = c[word.length() / 2 - 1] + "" + c[word.length() / 2];
        } else {
            c = word.toCharArray();
            result = c[word.length() / 2] + "";
        }
        return result;
    }

    public static int rentalCarCost(int d) {
        int costDay = 40;
        int costDay7off = 50;
        int costDay3off = 20;
        if (d < 3) {
            return d * costDay;
        } else if (d >= 3 && d < 7) {
            return d * costDay - costDay3off;
        }
        return d * costDay - costDay7off;
    }

    public static String doubleChar(String s) {
        return stream(s.split("")).map(x -> new StringBuilder(x).append(x)).collect(Collectors.joining(""));
    }

    static String removeExclamationMarks(String s) {
        return s.replaceAll("\\W|\\s", "");
    }

    public static int squareSum(int[] n) {
//        int sum = 0;
//        for (int elem:n) {
//            sum+=(int)Math.pow(elem,2);
//        }
//        return sum;

        return Arrays.stream(n).map(x -> (int) Math.pow(x, 2)).sum();
    }

    public static String toJadenCase(String phrase) {
//        if(phrase != null && !phrase.equals("")) {
//            String[] str = phrase.split(" ");
//            StringBuilder stringBuilder = new StringBuilder();
//            for (int i = 0; i < str.length; i++) {
//                char[] chars = str[i].toCharArray();
//                String ch = String.valueOf(chars[0]).toUpperCase();
//                chars[0] = ch.charAt(0);
//                stringBuilder.append(chars).append(" ");
//            }
//            return stringBuilder.toString().trim();
//        }
//        return null;
        //return Arrays.stream(phrase.split(" ")).map(String::toCharArray).map(elem->elem[0]).map(elem -> elem.toString().toUpperCase()).collect(Collectors.joining(" "));
        return Arrays.stream(phrase.split(" ")).map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(Collectors.joining(" "));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int count = 0;
        do {
            p0 = p0 + (int) (p0 * percent / 100) + aug;
            count++;
        } while (p0 <= p);
        return count;
    }

    public static int howOld(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();

    }

    public static int enough(int cap, int on, int wait) {
        if (cap - on > wait)
            return 0;
        else {
            return -(cap - on - wait);
        }
    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> String.format("%s likes this", names[0]);
            case 2 -> String.format("%s and %s like this", names[0], names[1]);
            case 3 -> String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default -> String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        };
    }

    public static String updateLight(String current) {

        return switch (current) {
            case "Green" -> "Yellow";
            case "Yellow" -> "Red";
            default -> "Green";
        };
    }

    public static boolean feast(String beast, String dish) {

        return beast.startsWith(String.valueOf(dish.charAt(0))) && beast.endsWith(String.valueOf(dish.charAt(dish.length() - 1)));

    }

    public static String remove(String str) {

        return str.substring(1);
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int max = stream(input).filter(x -> x > 0).sum();
        int min = stream(input).filter(x -> x < 0).sum();
        if (input.length == 0)
            return new int[0];
        else
            return new int[]{max, min};
    }

    public static int areaOrPerimeter(int l, int w) {
        return l == w ? l * w : l * 2 + w * 2;
    }

    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers[0] != numbers[1]) {
            return numbers[0];
        } else {
            return numbers[numbers.length - 1];
        }
    }

    public static List<String> number(List<String> lines) {
        List<String> list = new ArrayList<>(lines.size());
        for (int i = 0; i < lines.size(); i++) {
            int num = i + 1;
            System.out.println(num);
            list.add(num + ": " + lines.get(i));
        }
        return list;
    }

    public static boolean isSquare(int n) {
        return n == Math.pow((int) Math.sqrt(n), 2) && n > 1;
    }

    public static boolean comp(int[] a, int[] b) {
        if ((a == null) || (b == null)) {
            return false;
        }
        int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
        Arrays.sort(aa);
        Arrays.sort(b);
        return (Arrays.equals(aa, b));

    }

    public static String[] towerBuilder(int f) {
        return range(0, f).mapToObj(i -> String.format("%1$s%2$s%1$s", " ".repeat(f - i - 1), "*".repeat(2 * i + 1))).toArray(String[]::new);

    }

    public static boolean isIsogram(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int GetSum(int a, int b) {
        int sum = 0;
        if (a == b)
            return a;
        else {
            if (a < b)
                for (int i = a; i <= b; i++) {
                    sum += i;
                }
            if (a > b)
                for (int i = b; i <= a; i++) {
                    sum += i;
                }
        }
        return sum;
    }

    public static int duplicateCount(String text) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            characterIntegerHashMap.put(c, characterIntegerHashMap.containsKey(c) ? 1 : 0);
        }
        return (int) characterIntegerHashMap.values().stream().filter(x -> x > 0).count();
    }

    public static String convert(boolean b) {
        return b ? "true" : "false";
        //return Boolean.toString(b);
    }

    public static int getCount(String str) {
        int count = 0;
        String str1 = str.replaceAll("[aeiou]", "*");
        System.out.println(str1);
        char[] chars = str1.toCharArray();
        for (char c : chars) {
            if (c == '*') {
                count++;
            }
        }
        return count;
    }

    //return str.replaceAll("[^aeiou]","").length();
    public String dnaToRna(String dna) {
        return dna.replaceAll("T", "U");
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed && !vacation) {
            return true;
        }
        return false;
    }

    public static String highAndLow(String numbers) {
        // Code here or
        String max = stream(numbers.split(" ")).max(Comparator.comparingInt(Integer::parseInt)).get();
        String min = stream(numbers.split(" ")).min(Comparator.comparingInt(Integer::parseInt)).get();
        return max + " " + min;
    }

    public long numberOfDivisors(int n) {
//        long count  = 0;
//        for (int i = 1; i <= n; i++) {
//            if(n % i ==0){
//                count++;
//            }
//        }
//        return count;
        return IntStream.range(1, n + 1).filter(i -> n % i == 0).count();
    }

    public static boolean getXO(String str) {
        HashMap<Character, Integer> integerHashMap = new HashMap<>();
        char[] chars = str.toLowerCase().toCharArray();
        int countX = 0;
        int countO = 0;
        for (char aChar : chars) {
            if (aChar == 'o') {
                integerHashMap.put('x', ++countO);
            }
            if (aChar == 'x') {
                integerHashMap.put('x', ++countX);
            }
        }
        return countX == countO;
//        long countX = str.toLowerCase().chars().filter(ch -> ch =='x').count();
//        long countO = str.toLowerCase().chars().filter(ch -> ch =='o').count();
//
//        return (countO==countX);
    }

    public static String stripComments(String text, String[] commentSymbols) {
        String str = "\\s" + commentSymbols[0] + ".*";
        String str1 = "\\s" + commentSymbols[1] + ".*";
        return text.replaceAll(str, "");//.replaceAll(str1,"");
    }

    public static int parseInt(String numStr) {
        // Your code here!
        return -1;
    }

    public boolean check(String sentence) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (!sentence.toLowerCase().contains("" + i)) {
                return false;
            }
        }
        return true;
    }

    public static int[] minMax(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        int min = Arrays.stream(arr).min().orElse(-1);
        return new int[]{min, max};
    }

    public static int[] between(int a, int b) {

        return IntStream.rangeClosed(a, b).toArray();
    }

    public static String BracketMatcher(String str) {
//        char[] chars = str.replaceAll("[a-zA-Z]","").toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i+1]==')')
//        }
        String str1 = str.replaceAll("[a-zA-Z\\s\\d]", "");
        if (str1.length() % 2 == 0 || str1.length() == 0) {
            return "1";
        } else
            return "0";
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static int makeNegative(final int x) {
        if (x > 0) {
            return -x;
        }
        return x;
    }
    public static double sum(double[] numbers) {
        return stream(numbers).sum();
    }
    public static String hoopCount(int n){
        return n >= 0 ? "Great, now move on to tricks" :  "Keep at it until you get it";
    }
    public static String correct(String string) {
        return string.replaceAll("S","5").replaceAll("I","1").replaceAll("0","0");
    }
    public static String abbrevName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = name.toUpperCase().split(" ");
        for (String str: words) {
            String[] letters = str.split("");
            stringBuilder.append(letters[0]);
            stringBuilder.append(".");
        }

        return stringBuilder.substring(0,2);
    }
//    return Arrays.stream(name.split(" "))
//            .map(String::toUpperCase)
//                 .map(word -> word.substring(0, 1))
//            .collect(Collectors.joining("."));
}