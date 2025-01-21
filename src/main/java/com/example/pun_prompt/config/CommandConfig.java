package com.example.pun_prompt.config;

import com.example.pun_prompt.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.command.CommandRegistration;

@Configuration
public class CommandConfig {

    @Value("${app.version}")
    private String appVersion;

    private final JokeService jokeService;

    @Autowired
    public CommandConfig(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @Bean
    public CommandRegistration scriptCommand() {
        return CommandRegistration.builder()
                .command("script")
                .hidden(true)
                .withTarget()
                .function(commandContext -> null)
                .and()
                .build();
    }

    @Bean
    public CommandRegistration builtInVersionCommand() {
        return CommandRegistration.builder()
                .command("version")
                .hidden(true)
                .withTarget()
                .function(commandContext -> null)
                .and()
                .build();
    }

    @Bean
    public CommandRegistration versionCommand() {
        return CommandRegistration.builder()
                .command("version")
                .withAlias()
                .command("v")
                .and()
                .withTarget()
                .function(commandContext -> "Pun-Prompt v" + appVersion)
                .and()
                .description("Prints app version")
                .build();
    }

    @Bean
    public CommandRegistration jokeCommand() {
        return CommandRegistration.builder()
                .command("joke")
                .withAlias()
                .command("j")
                .and()
                .withTarget()
                .function(commandContext -> {
                    try {
                        return jokeService.getRandomJoke();
                    } catch (Exception e) {
                        return "Error fetching joke: " + e.getMessage();
                    }
                })
                .and()
                .description("Prints a random joke to the console")
                .build();
    }
}