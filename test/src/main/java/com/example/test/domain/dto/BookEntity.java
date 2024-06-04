package com.example.test.domain.dto;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class BookEntity {

    // MySQL 수정하기

    @Id
    private Long book_id;
    private String writer;
    private String bookName;
    private String bookCover;
    private String bookDatail;
    private String bookNumber;
    private String genre;
    private boolean isExist;
    private boolean isStored;
    private boolean isApply;
    private boolean isMajor;
    private boolean isCertification;
}
