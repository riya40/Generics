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


}