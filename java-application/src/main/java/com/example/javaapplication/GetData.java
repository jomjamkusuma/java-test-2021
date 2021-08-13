package com.example.javaapplication;

import org.springframework.web.client.RestTemplate;

public class GetData {

    public static void main(String[] args) {
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
