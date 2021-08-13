package com.example.javaapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.persistence.Entity;
import javax.swing.table.TableStringConverter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(JavaApplication.class, args);




		for(int i=1 ; i<=200 ; i++){
			String url = "https://jsonplaceholder.typicode.com/photos/" + Integer.toString(i);
			RestTemplate restTemplate = new RestTemplate();


			Employee employee = restTemplate.getForObject(url, Employee.class);

			if(employee.getAlbumId()!=0 && employee.getId()!=0){
				//Add to excel
			}


		}


	}





}
