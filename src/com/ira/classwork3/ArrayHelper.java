package com.ira.classwork3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayHelper {

    private ArrayHelper() {
    }

    public static int[] innerUnion(int[] firstArr, int[] secondArr) {
        if (firstArr == null || secondArr == null) {
            return new int[]{};
        }

        int[] _firstArr = firstArr.clone();
        int[] _secondArr = secondArr.clone();

        Arrays.sort(_firstArr);
        Arrays.sort(_secondArr);
        int[] innerUnion = null;
        int traceIndex = 0;
        int peersCounter = 0;
        for (int elem : _firstArr) {
            int position = Arrays.binarySearch(_secondArr, elem);
            if (position >= 0)
                peersCounter++;
        }

        innerUnion = new int[peersCounter];
        for (int elem : _firstArr) {
            int position = Arrays.binarySearch(_secondArr, elem);
            if (position >= 0) {
                innerUnion[traceIndex++] = _secondArr[position];

            }
        }

        return innerUnion;

    }

    public static int[] outerUnion(int[] firstArr, int[] secondArr) {
        if (firstArr == null || secondArr == null) {
            return new int[]{};
        }

        int[] outerUnion;
        int[] innerUnion = innerUnion(firstArr, secondArr);
        int numberInnerElements = innerUnion.length;
        int numberOfElements = (firstArr.length + secondArr.length) - numberInnerElements * 2;
        int elementsIndex = 0;

        outerUnion = new int[numberOfElements];
        for (int elem : firstArr) {
            int position = Arrays.binarySearch(innerUnion, elem);
            if (position < 0) {
                outerUnion[elementsIndex++] = elem;
            }
        }

        for (int elem : secondArr) {
            int position = Arrays.binarySearch(innerUnion, elem);
            if (position < 0) {
                outerUnion[elementsIndex++] = elem;
            }
        }

        return outerUnion;
    }

    public static int[] leftUnion(int[] firstArr, int[] secondArr) {
        //задаем граничные значения
        //если левый массив равен нулл, то возвращаем пустой массив
        //если кол-во элементов левого массива = нулю, то возвращаем пустой массив
        if (firstArr == null || secondArr.length == 0)
            return new int[]{};
        //находим одинаковые элементы массивов
        int[] innerUnion = innerUnion(firstArr.clone(), secondArr.clone());
        //копируем их в результ массив
        //делаем мссив правильной длины и копируем все элементы результ массива
        int[] leftUnion = new int[firstArr.length + innerUnion.length];
        System.arraycopy(firstArr, 0, leftUnion, 0, firstArr.length);
        System.arraycopy(innerUnion, 0, leftUnion, firstArr.length, innerUnion.length);
        //возвращ правильныйс масив
        return leftUnion;
    }

    public static int[] mergeWithoutDuplicates(int[]firstArr, int[] secondArr){
       if(firstArr == null || secondArr == null)
           return new int[]{};
        int[] mergeWithoutDuplicates = null;
        int[] innerUnion = innerUnion(firstArr.clone(), secondArr.clone());
        int[] secondPart;

        secondPart = new int[secondArr.length - innerUnion.length];
        int numberOfElements = 0;
        for(int elem : secondArr){
            int position = Arrays.binarySearch(innerUnion, elem);
            if(position < 0){
                secondPart[numberOfElements++] = elem;
            }
        }

        int number = (firstArr.length + secondArr.length - innerUnion.length);
        mergeWithoutDuplicates = new int[number];

        System.arraycopy(firstArr, 0, mergeWithoutDuplicates, 0, firstArr.length);
        System.arraycopy(secondPart, 0, mergeWithoutDuplicates, firstArr.length, secondPart.length);

        return mergeWithoutDuplicates;

    }
}
