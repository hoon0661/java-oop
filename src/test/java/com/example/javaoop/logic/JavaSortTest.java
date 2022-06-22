package com.example.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("Java Sort")
    @Test
    void given_Input_WhenExecuting_ThenReturnOutput() {
        //Given
        JavaSort<Integer> javaSort = new JavaSort<>();


        //When
        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));


        //Then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}