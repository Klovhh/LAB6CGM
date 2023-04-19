package com.example.lab6cgm;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayTest {
    private Operaciones Op;
    int[] array1 = {1,2,3,4,5,6,7,8,9,10};
    int[] array2 = {-1,-2,-3,-1,5,6,6,8,999999,0};


    @Before
    public void setUp(){

        Op = new Operaciones();
    }
    @Test
    public void buscarNumeroNegativo(){
        boolean res = Op.searchNumber(array2, -1);
        assertThat(res, is(equalTo(true)));
    }

    @Test
    public void buscarNumeroGrande(){
        boolean res = Op.searchNumber(array2, 999999);
        assertThat(res, is(equalTo(true)));
    }

    @Test
    public void buscarNumeroQueNoEsta(){
        boolean res = Op.searchNumber(array1, -1);
        assertThat(res, is(equalTo(false)));
    }

    @Test
    public void buscarNumeroQueSiEsta(){
        boolean res = Op.searchNumber(array1, 10);
        assertThat(res, is(equalTo(true)));
    }

    @Test
    public void contarNumerosNegativos(){
        int res = Op.countOccurrences(array2, -1);
        assertThat(res, is(equalTo(2)));
    }

    @Test
    public void contarNumerosGrandes(){
        int res = Op.countOccurrences(array2, 999999);
        assertThat(res, is(equalTo(1)));
    }

    @Test
    public void contarNumerosQueNoEstan(){
        int res = Op.countOccurrences(array2, 20);
        assertThat(res, is(equalTo(0)));
    }

    @Test
    public void contarNumerosQueSiEstan(){
        int res = Op.countOccurrences(array1, 1);
        assertThat(res, is(equalTo(1)));
    }

}
