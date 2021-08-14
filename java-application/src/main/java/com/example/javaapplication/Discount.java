package com.example.javaapplication;

import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Discount {

    private int[] bookList;

    public int getDiscount(int[] bookList) {
        this.bookList =bookList;

        if(bookList.length == 2){
            return 5;
        }

        if(bookList.length == 3){
            return 10;
        }

        if(bookList.length == 4){
            return 20;
        }

        if(bookList.length == 5){
            return 25;
        }


        return 0;
    }




}
