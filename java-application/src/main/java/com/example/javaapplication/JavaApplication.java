package com.example.javaapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.persistence.Entity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(JavaApplication.class, args);


		final String url = "https://jsonplaceholder.typicode.com/photos/1";
		RestTemplate restTemplate = new RestTemplate();

		Employee result = restTemplate.getForObject(url, Employee.class);

		System.out.println(result.getUrl());
		System.out.println(result.getTitle());


	}


	public static class Employee {
		private int albumId;
		private int id;
		private String title;
		private String url;

		public int getAlbumId() {
			return albumId;
		}

		public void setAlbumId(int albumId) {
			this.albumId = albumId;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}
}
