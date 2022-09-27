package task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1,-10,5,0,6};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
        String str = "ABBA";
        char [] chars =str.toCharArray();
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            chars1[chars1.length - 1 - i] = chars[i];
        }
        System.out.println(new String(chars1));
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse().toString();
        Map<String,Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Fedor", 10);
        for (Map.Entry<String,Integer> m: stringIntegerMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        String[] strings = new String[]{"Fedor","Alex","Bob"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

    }

}
