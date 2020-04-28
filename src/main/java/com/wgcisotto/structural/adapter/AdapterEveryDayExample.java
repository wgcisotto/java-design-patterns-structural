package com.wgcisotto.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEveryDayExample {

    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[]{1, 2, 3, 4};

        List<Integer> listOfInteger = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);

        System.out.println(listOfInteger);

    }

}
