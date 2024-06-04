package com.example.test.domain.controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.Map;

@Service
@Slf4j
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class WebClientServiceimpl {
    private final WebClient webClient;

    public void get() {
        String code = "myCode";
        // api 요청
        try {
            // API 요청
            Map response = webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/api/get")
                            .queryParam("code", code)
                            .build())
                    .retrieve()
                    .bodyToMono(Map.class)
                    .block();

            // 결과 확인
            log.info("response 결과 : ", response);
        } catch (WebClientResponseException e) {
            log.error("Error response from API: {}", e.getResponseBodyAsString(), e);
        } catch (Exception e) {
            log.error("Unexpected error during API call", e);
        }

    }
}
