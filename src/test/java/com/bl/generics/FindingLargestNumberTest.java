package com.bl.generics;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindingLargestNumberTest {
    FindingLargestNumber findingLargestNumber = new FindingLargestNumber();
    //adding testcase for firstnumber
    @Test
    public void testlargestfirstvalueshouldlarge() {
        int a = findingLargestNumber.maximum(5, 4, 2);
        Assertions.assertEquals(5, a);
        System.out.println("test is done");
    }
    //adding testcase for checking 2nd number largest
    @Test
    public void tesrlargestsecondvalue() {
        int a = findingLargestNumber.maximum(3, 4, 2);
        Assertions.assertEquals(4, a);
        System.out.println("test is done");
    }

    //adding testcase for checking 3rd number largest
    @Test
    public void testlargestthirdvalue() {
        int a = findingLargestNumber.maximum(5, 4, 9);
        Assertions.assertEquals(9,a);
        System.out.println("test is done");
    }
    //adding testcase for firstnumber
    @Test
    public void testLargestFirstValueShouldLargeinFloatType() {
        Double a = findingLargestNumber.maximum(5.5, 4.1, 2.0);
        Assertions.assertEquals(5, a);
        System.out.println("test is done");
    }
    //adding testcase for checking 2nd number largest
    @Test
    public void testLargestShouldBeSecondValue() {
        Double a = findingLargestNumber.maximum(3.0, 4.7, 2.1);
        Assertions.assertEquals(4.7,a);
        System.out.println("test is done");
    }
    //adding testcase for checking 3rd number largest
    @Test
    public void testLargestShouldBeThirdValue() {
        Double a = findingLargestNumber.maximum(5.4, 4.9, 9.7);
        Assertions.assertEquals(9.7,a);
        System.out.println("test is done");
    }


}