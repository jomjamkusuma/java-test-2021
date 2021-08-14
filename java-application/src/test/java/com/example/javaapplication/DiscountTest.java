package com.example.javaapplication;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void noBook(){
        List<Integer> list = new ArrayList<>();

        Discount discount = new Discount();
        int result = discount.getDiscount(list);

        assertEquals(0 ,result);
    }

}