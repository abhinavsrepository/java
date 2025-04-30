package javaHomework;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

    public static void main(String[]agrs){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        int sum = numbers.get(10)+numbers.get(1);
        System.out.println("Sum"+sum);

    }
}
