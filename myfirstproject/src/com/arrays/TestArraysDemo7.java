package com.arrays;

import java.util.*;
class J{
    public static void main(String[] args) {
        int[] a = {12,344,556,312};

        int[] b = {21,34,21,34};

        int[] c = new int[a.length];

        for(int i = 0 ; i < c.length ; i++){
            c[i] = a[i] + b[i];
        }
       
        System.out.println("The array is : " + Arrays.toString(c));
    }
}