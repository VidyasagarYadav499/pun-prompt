package com.example.pun_prompt.commands;

import com.example.pun_prompt.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class JokeCommands {

    private final JokeService jokeService;

    @Autowired
    public JokeCommands(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @ShellMethod(key = {"joke", "j"},
            value = "Prints a random joke to the console")
    public String getJoke() {
        try {
            return jokeService.getRandomJoke();
        } catch (Exception e) {
            return "Error fetching joke: " + e.getMessage();
        }
    }
}