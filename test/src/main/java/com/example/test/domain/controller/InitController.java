package com.example.test.domain.controller;


import com.example.test.domain.dto.response.ResponseVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@RestController
@RequiredArgsConstructor
@Slf4j
public class InitController {

    private final WebClient webClient;
    private final ResponseVo responseVo = new ResponseVo();

    @GetMapping("/hello")
    public ResponseEntity<ResponseVo> initApi(@RequestParam String input) {
        responseVo.setTitle(input);
        log.info("수정완 : " + responseVo.getTitle());
        return ResponseEntity.ok(responseVo);
    }

    @GetMapping("/api")
    public ResponseEntity<String> testApi() {   //@RequestParam String data
        WebClient.builder()
                .baseUrl("http://www.aladin.co.kr")
                .build();


        String apiKey = "ttbcmss03302033001";
        String itemId = "9791155817049";
        String apiUrl = "/ttb/api/ItemLookUp.aspx?ttbkey=ttbcmss03302033001&itemIdType=ISBN&ItemId=9791155817049&output=xml&Version=20131101&OptResult=ebookList,usedList,reviewList";
//        ResponseEntity re = new ResponseEntity();

        try {
            String res = webClient.get()
                    .uri(apiUrl)    //data
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            log.info("response is : " + res);

            /*
            String result = webClient.get()
                    .uri("")
                    .accept(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                    .body()
                    .retrive()
                    .bodyToMono(String.class)
                    .block();
             */
            //ResponseVo responseVo = new ResponseVo();

            if (res == null) {
                log.info("오류");

                //responseVo.setUcd("99");
                //responseVo.setMessage("실패");
            } else {
                log.info("성공");

                //responseVo.setUcd("00");
                //responseVo.setMessage(res);
            }
            return ResponseEntity.ok("responseVo완료됨");
        } catch (WebClientResponseException e) {
            log.error("API로부터 오류 응답을 받았습니다: {}", e.getResponseBodyAsString(), e);
            return ResponseEntity.status(e.getStatusCode()).body("API 호출 실패: " + e.getResponseBodyAsString());
        } catch (Exception e) {
            log.error("API 호출 중 예상치 못한 오류 발생", e);
            return ResponseEntity.status(500).body("API 호출 중 예상치 못한 오류 발생: " + e.getMessage());
        }
    }
}
