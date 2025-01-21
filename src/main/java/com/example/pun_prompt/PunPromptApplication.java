package com.example.pun_prompt;

import com.example.pun_prompt.api.response.JokeResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

@SpringBootApplication
@ImportRuntimeHints(PunPromptApplication.PunPromptRuntimeHints.class)
public class PunPromptApplication {

	public static void main(String[] args) {
		SpringApplication.run(PunPromptApplication.class, args);
	}

	static class PunPromptRuntimeHints implements RuntimeHintsRegistrar {
		@Override
		public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
			hints.reflection().registerType(JokeResponse.class);
			hints.resources().registerPattern("org/springframework/shell/*");
			hints.resources().registerPattern("org/jline/*");
		}
	}
}