package coderwar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindrom("шалаш"));
        int[] array = new int[]{10,2,5,3,1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int temp;
            for (int j = i; j < array.length  ; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(countBy(3,3)));
        System.out.println(Arrays.toString(invert(new int[]{-2,3,4})));
        System.out.println(century(89));
        System.out.println(pigIt("Pig latin is cool ?"));
    }
    static boolean palindrom(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length ; i++) {
            if(arrayOfSheeps[i]){
                count++;
            }
            if(arrayOfSheeps[i] == null){
                continue;
            }
        }
        return count;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int j : arr) {
            if (j > 0) {
                sum += j;
            }
        }
        return sum;
    }
    public static String rps(String p1, String p2) {
        return "S";
    }
    public static int[] countBy(int x, int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x * (i+1) ;
        }
        return arr;
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        int av = 0;
        for(int i = 0; i < classPoints.length; i++){
            sum+=classPoints[i];
        }
        av = sum/classPoints.length;
        return yourPoints > av;
       // return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return  mpg * fuelLeft >= distanceToPump;
    }
    public static int[] invert(int[] array) {

        return Arrays.stream(array).map(x-> -x).toArray();
    }
    public static int century(int number) {
        String str = Integer.toString(number);
        if(str.endsWith("00"))
            return number/100;
        return number/100 + 1;
    }
    public static String pigIt(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = str.split(" ");
        if(strings[strings.length-1].matches("[a-z]*")){
            for (int i = 0; i < strings.length ; i++) {
                String[] s = strings[i].split("");
                for (int y = 1; y < s.length; y++) {
                    stringBuilder.append(s[y]);
                }
                stringBuilder.append(s[0]);
                stringBuilder.append("ay");
                stringBuilder.append(" ");
            }
        } else {
            stringBuilder.append(strings[strings.length-1]);
        }
        return stringBuilder.toString();
    }
}
