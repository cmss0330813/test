package com.example.test.domain.service;

import com.example.test.domain.dto.response.BookApiResponse;
import com.example.test.domain.dto.BookEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
@Transactional
@RequiredArgsConstructor

public class BookService {
    @Autowired
    //restTemplate 방식
    RestTemplate restTemplate = new RestTemplate();
    @Transactional
    public BookEntity fetchData() {
        //예시
        //근데 이 isbn 값도 front에서 post로 받은 bookid이어야 하는데 일단 !


        String isbn = "9791155817049";
        String openApi_permitted = "ttbcmss03302033001";
        String apiUrl = "http://www.aladin.co.kr/ttb/api/ItemLookUp.aspx?ttbkey="+openApi_permitted+"&itemIdType=ISBN&ItemId="+isbn+"&output=xml&Version=20131101&OptResult=ratingInfo,reviewList,fulldescription2,Story";
        BookApiResponse response = restTemplate.getForObject(apiUrl, BookApiResponse.class);
        BookApiResponse.Item item = response.getItem().get(0);
        BookEntity book = BookEntity.builder()
                .book_id(item.getBook_id())
                .writer(item.getWriter())
                .bookName(item.getBookName())
                .bookCover(item.getBookCover())
                .bookDatail(item.getBookDatail())
                .bookNumber(item.getBookNumber())
                .genre(item.getGenre())
                .build();
        return book;
    }
}

