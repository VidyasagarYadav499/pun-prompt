package com.example.pun_prompt.service;

import com.example.pun_prompt.api.response.JokeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class JokeService {

    private final RestTemplate restTemplate;

    @Autowired
    public JokeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getRandomJoke() {
        String API_URL = "https://icanhazdadjoke.com/";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<JokeResponse> response = restTemplate.exchange(
                API_URL,
                HttpMethod.GET,
                entity,
                JokeResponse.class
        );

        return Objects.requireNonNull(response.getBody()).getJoke();
    }
}