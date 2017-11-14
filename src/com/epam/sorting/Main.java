package com.epam.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System;

public class Main {

    public static void main(String[] args) {
        String elementInArray = null;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(is);
        try {
            System.out.println("Input number and press <Enter>: ");
            elementInArray = buf.readLine();
        } catch (IOException e) {
            System.err.print("ошибка ввода " + e);
        }
        int[] array = {5, 3, 12, 1, 11, 7, 4, 17, 8, 23};
        SortData sortData = new SortData(array);

        //Bubble sort
        int[] sortedArray = sortData.bubbleSort();
        int findelement = Integer.parseInt(elementInArray);

        int left = 0;
        int right = sortedArray.length;
        int midd = (left + right) / 2;

        //Binary search
        int position = sortData.binarySearch(findelement, sortedArray, left, right, midd);
        System.out.println("Position in array " + position);
    }


}
