package com.example.pun_prompt.prompt;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class CustomPromptProvider implements PromptProvider {

    @Override
    public AttributedString getPrompt() {
        String time = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss"));
        String appName = "pun-prompt";
        String promptText = String.format("[%s] %s -> ", time, appName);

        return new AttributedString(promptText,
                AttributedStyle.DEFAULT
                        .foreground(AttributedStyle.YELLOW)
                        .bold());
    }
}