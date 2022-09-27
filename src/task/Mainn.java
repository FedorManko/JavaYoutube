package task;

import java.util.Scanner;

public class Mainn {
    public static String StringChallenge(String num) {
        String[] strings = num.split("");
        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++){
            integers[i] = Integer.parseInt(strings[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < integers.length-1; i++){
            if(integers[i] == 0 && (integers[i+1] %2 == 0 || integers[i+1] % 2 != 0)){
                stringBuilder.append(strings[i]);
                //stringBuilder.append(strings[i+1]);
            } else if(integers[i] % 2 != 0 && integers[i+1] % 2 != 0){
                stringBuilder.append(strings[i]);
                stringBuilder.append("-");
            } else if(integers[i] % 2 == 0 && integers[i+1] % 2 == 0  && integers[i+1] != 0){
                stringBuilder.append(strings[i]);
                stringBuilder.append("*");
            } else if(integers[i] % 2 != 0 && integers[i+1] % 2 == 0){
                stringBuilder.append(strings[i]);
            }  else if(integers[i] % 2 == 0 && integers[i+1] % 2 != 0){
                stringBuilder.append(strings[i]);
            } else if((integers[i] %2 == 0 || integers[i] % 2 != 0) && integers[i+1] == 0){
                stringBuilder.append(strings[i]);
            }
            // } else if(i == integers.length-1){
            //   stringBuilder.append(strings[integers.length]);
            // }
            System.out.println(stringBuilder.toString() + " i= " + i);
        }
        stringBuilder.append(integers[integers.length-1]);
        return stringBuilder.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge("39904467"));
    }
}
