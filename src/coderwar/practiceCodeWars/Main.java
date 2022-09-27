package coderwar.practiceCodeWars;

import java.util.Scanner;

public class Main {

  public static final char ZERO = '$';
  public static final char EVEN = '*';
  public static final char ODD = '#';

  public static void main(String[] args) {
    String next = inputNumber();

    String result = calculate(next);

    System.out.println(result);
  }

  private static String inputNumber() {
    Scanner scanner = new Scanner(System.in);
    return scanner.next();
  }

  private static String calculate(String next) {
    char[] chars = next.toCharArray();
    char[] symbols = new char[chars.length - 1];
    int counter = 0;

    for (int i = 0; i < chars.length - 1; i++) {
      if (isZero(chars[i], chars[i + 1])) {
        symbols[counter] = ZERO;
        counter++;
        continue;
      }
      if (isEven(chars[i], chars[i + 1])) {
        symbols[counter] = EVEN;
        counter++;
        continue;
      }
      if (!isEven(chars[i], chars[i + 1])) {
        symbols[counter] = ODD;
        counter++;
      }
    }
    return String.valueOf(merge(chars, symbols));
  }

  static char[] merge(char[] x, char[] y) {
    int counterX = 0;
    int counterY = 0;
    char[] result = new char[x.length + y.length];

    for (int i = 0; i < result.length; i++) {
      result[i] = (i % 2 == 0) ? x[counterX++] : y[counterY++];
    }
    result[result.length - 1] = x[x.length - 1];
    return result;
  }

  static boolean isZero(char x, char y) {
    return Character.getNumericValue(x) == 0 || Character.getNumericValue(y) == 0;
  }

  static boolean isEven(char x, char y) {
    return Character.getNumericValue(x) % 2 == 0 && Character.getNumericValue(y) % 2 == 0;
  }
}