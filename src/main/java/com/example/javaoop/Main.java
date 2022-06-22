package com.example.javaoop;

import com.example.javaoop.logic.BubbleSort;
import com.example.javaoop.logic.JavaSort;
import com.example.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
