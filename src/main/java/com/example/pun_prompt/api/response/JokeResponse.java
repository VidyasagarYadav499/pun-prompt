package com.example.pun_prompt.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JokeResponse {
    @JsonProperty("id")
    private String id;

    @JsonProperty("joke")
    private String joke;

    @JsonProperty("status")
    private int status;

    public JokeResponse() {
    }

    public String getId() {
        return id;
    }

    public String getJoke() {
        return joke;
    }

    public int getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}