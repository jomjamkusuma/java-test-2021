package com.example.javaapplication;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    @DisplayName("get 0% discount")
    void noBook(){
        int[] array = {};

        Discount discount = new Discount();
        int result = discount.getDiscount(array);

        assertEquals(0 ,result);
    }

    @Test
    @DisplayName("get 5% 10% 20% 25% discount")
    void basicDiscount(){

        Discount discount = new Discount();

        int[] arr1 = {1,2};
        assertEquals(5 ,discount.getDiscount(arr1));

        int[] arr2 = {1,2,3};
        assertEquals(10 ,discount.getDiscount(arr2));

        int[] arr3 = {1,2,3,4};
        assertEquals(20 ,discount.getDiscount(arr3));

        int[] arr4 = {1,2,3,4,5};
        assertEquals(25 ,discount.getDiscount(arr4));
    }

}