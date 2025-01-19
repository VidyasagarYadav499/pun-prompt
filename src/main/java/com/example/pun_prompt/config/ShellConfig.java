package com.example.pun_prompt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.command.CommandRegistration;

@Configuration
public class ShellConfig {

    @Bean
    public CommandRegistration scriptCommand() {
        return CommandRegistration.builder()
                .command("script")
                .hidden(true)
                .withTarget()
                .function(ctx -> null)
                .and()
                .build();
    }
}