package com.example.test.domain.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookApiResponse {

    private boolean isExist;
    private boolean isStored;
    private boolean isApply;
    private boolean isMajor;
    private boolean isCertification;
    private List<Item> item;

    public BookApiResponse(boolean b, String string) {
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Item {
        private Long book_id;
        private String writer;
        private String bookName;
        private String bookCover;
        private String bookDatail;
        private String bookNumber;
        private String genre;
    }
}
