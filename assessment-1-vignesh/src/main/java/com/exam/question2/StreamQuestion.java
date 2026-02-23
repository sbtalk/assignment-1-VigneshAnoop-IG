package com.exam.question2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamQuestion {
    static void main() {
        List<Integer> nums = Arrays.asList(1,5,7,9,4,11,3,45,32,12,15,51,22,14,17);

        //1
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //2

        int sum=nums.stream().reduce((x,y)->x+y).get();
        System.out.println(sum);

        //3
        nums.stream().sorted((a, b) -> b - a).forEach(System.out::println);

    }
}
