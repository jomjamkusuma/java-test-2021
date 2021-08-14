package com.example.javaapplication;

import org.springframework.data.jpa.repository.JpaRepository;

interface BookStoreRepository extends JpaRepository<Book, Integer> {
}
