package com.example.javaapplication;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void getIntoClass(){
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1,"HarryPotter1"));

        Discount discount = new Discount();
        String result = discount.getDiscount(list);
        assertEquals("Hello",result);
    }

}