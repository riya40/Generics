package com.bl.generics;


public class FindingLargestNumber {

    public static  <T extends Comparable<T>> T maximum(T x,T y,T z) {
        T max = x;

        if(y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0){
            max = z;
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(maximum(3,6,7));
        System.out.println(maximum(2.2,1.5,5.6));
        System.out.println(maximum("priya","lakshmi","rick"));


    }

}
