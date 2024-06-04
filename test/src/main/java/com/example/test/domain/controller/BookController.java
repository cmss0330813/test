package com.example.test.domain.controller;


import com.example.test.domain.service.BookService;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
@CrossOrigin(origins = "*")
public class BookController {

    private BookService bookService;

    @GetMapping("/totheFront")
    public String springData(String msg) {
        return msg;
    }





    //service에서 book객체로 저장된 걸 가져온다
    //webClient 사용
    @GetMapping("/api1")
    public Mono<String> useWebClient() {
        HttpClient httpClient = HttpClient.create()
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000) //timeout 시간
                .responseTimeout(Duration.ofMillis(5000))
                .doOnConnected(conn->
                        conn.addHandlerLast(new ReadTimeoutHandler(5000, TimeUnit.MILLISECONDS))
                                .addHandlerLast(new WriteTimeoutHandler(5000, TimeUnit.MILLISECONDS)));

        var webClient = WebClient.builder()
                .baseUrl("http://www.aladin.co.kr/ttb/api/ItemLookUp.aspx?ttbkey=ttbcmss03302033001&itemIdType=ISBN&ItemId=9791155817049&output=xml&Version=20131101&OptResult=ebookList,usedList,reviewList")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .build();

        return webClient.get()
                .retrieve()
                .bodyToMono(String.class);

    }


}



/*
//restResponse 사용
 public ResponseEntity<ApiResponse<List<BookApiResponse>>> fetchDataFromApi() {
        bookService.fetchData();
        List<BookApiResponse> response = new BookApiResponse()_
        return new ResponseEntity<>(response, HttpStatus.OK);

        return ResponseEntity
                .status(ProgramSuccess.PROGRAM_LIST_VIEW_SUCCESS.getHttpStatus())
                .body(
                        ApiResponse.success(ProgramSuccess.PROGRAM_LIST_VIEW_SUCCESS, programListByStatus)
                );
    }
 */