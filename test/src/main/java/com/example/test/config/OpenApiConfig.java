package com.example.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
}

/*

    @Bean
    public OpenApiConfig openApi() {
        Info info = new Info()
                .version("v1.0.0")
                .title("test")
                .description("이것은 연습용");
        return new OpenApiConfig()
                .info(info);
    }

 */