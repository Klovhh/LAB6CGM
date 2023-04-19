package com.example.lab6cgm;

import android.view.View;

public class Operaciones {
    public int countOccurrences(int[] array, int numeroBusqueda) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBusqueda) {
                count++;
            }
        }
        return count;

    }

    public boolean searchNumber(int[] array, int numeroBusqueda) {
        boolean res = false;
        int count2 = 0;
        for (int j : array) {
            if (j == numeroBusqueda) {
                count2++;
            }
        }
        if (count2 > 0) {
            res = true;
        } else if (count2 == 0)
            res = false;
        return res;
    }
}
