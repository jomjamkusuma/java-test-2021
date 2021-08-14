package com.example.javaapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService ;

    //have zero experience on writing in layer

}
