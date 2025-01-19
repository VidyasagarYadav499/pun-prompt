package com.example.pun_prompt.api.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JokeResponse {
    private String id;
    private String joke;
    private int status;
}