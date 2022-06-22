package com.example.javaoop.service;

import com.example.javaoop.logic.JavaSort;
import com.example.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort = sort;
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
