package com.epam.mentoring;

import java.util.Arrays;

class SortData {

    private int[] rawArray;

    SortData(int[] array) {
        this.rawArray = array;
    }


    /**
     * @return array
     */
    int[] bubbleSort() {
        int[] array = this.rawArray;
        boolean isArraySorted;
        do {
            isArraySorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                int j;
                if (array[i] > array[i + 1]) {
                    j = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = j;
                    isArraySorted = false;
                }
            }
        } while (!isArraySorted);
        System.out.println("Sorted array " + Arrays.toString(array));
        return array;
    }


    /**
     * @return int
     */
    int binarySearch(int findelement, int[] sortedArray, int left, int right, int midd) {
        int pos = -1;
        if (findelement == sortedArray[midd]) {
            pos = midd;
        }else if(left == right && right == midd){
            return pos;
        }else if (findelement > sortedArray[midd]) {
            left = midd + 1;
            midd = (left + right) / 2;
            pos = binarySearch(findelement, sortedArray, left, right, midd);
        } else if (findelement < sortedArray[midd]) {
            right = midd - 1;
            midd = (left + right) / 2;
            pos = binarySearch(findelement, sortedArray, left, right, midd);
        }
        return pos;
    }


}
