package com.bl.generics;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class FindingLargestNumberTest {
    FindingLargestNumber findingLargestNumber = new FindingLargestNumber();
    //adding testcase for firstnumber
    @Test
    void testlargestfirstvalueshouldlarge() {
        int a = findingLargestNumber.maximum(5, 4, 2);
        Assertions.assertEquals(5, a);
        System.out.println("test is done");
    }
    //adding testcase for checking 2nd number largest
    @Test
    void tesrlargestsecondvalue() {
        int a = findingLargestNumber.maximum(3, 4, 2);
        Assertions.assertEquals(4, a);
        System.out.println("test is done");
    }

    //adding testcase for checking 3rd number largest
    @Test
    void testlargestthirdvalue() {
        int a = findingLargestNumber.maximum(5, 4, 9);
        Assertions.assertEquals(9,a);
        System.out.println("test is done");
    }


}