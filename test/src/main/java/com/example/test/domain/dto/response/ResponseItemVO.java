package com.example.test.domain.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseItemVO {
    String title;
    String author;
    String description;
    String isbn;
    String isbn13;
    String cover;
    String categoryId;
    String subTitle;
//그 뭐냐 여기 보니까 subInfo, usedList(aladinUsed, userUsed, spaseUsed) 이렇게 작은 객체들로 이루어졌는데 지금 다하기 너무 귀찮음
//다시 시작할때 이거 어떻게 할지 결정하는 걸로

}


/*
<title>듄 : 익스포저 - 듄 파트 1 + 2 공식 필름 에세이</title>
<link>http://www.aladin.co.kr/shop/wproduct.aspx?ItemId=334650717&partner=openAPI&start=api</link>
<author>조쉬 브롤린 (글), 한지원 (옮긴이), 그레이그 프레이저 (사진)</author>
<pubDate>2024-03-08</pubDate>
<description>전 세계적으로 팬들의 기대를 모으고 있는 〈듄〉(파트1+2편)의 한정판 아트북이자 공식 필름 에세이 『듄: 익스포저』가 마침내 한국어판으로 정식 출간된다. 베일에 싸인 채 단 한 번도 공개되지 않은 〈듄: 파트2〉의 스틸 컷과 제작 현장까지 싣고 있어 더욱 주목된다.</description>
<isbn>K392938842</isbn>
<isbn13>9791155817049</isbn13>
<priceSales>28800</priceSales>
<priceStandard>32000</priceStandard>
<mallType>BOOK</mallType>
<stockStatus>미출간</stockStatus>
<mileage>1600</mileage>
<cover>https://image.aladin.co.kr/product/33465/7/coversum/k392938842_1.jpg</cover>
<categoryId>51042</categoryId>
<categoryName>국내도서>예술/대중문화>영화/드라마>영화이야기</categoryName>
<publisher>윌북</publisher>
<salesPoint>1570</salesPoint>
<adult>false</adult>
<fixedPrice>true</fixedPrice>
<customerReviewRank>0</customerReviewRank>
<subInfo>
<subTitle>듄 파트 1 + 2 공식 필름 에세이</subTitle>
<originalTitle>Dune: Exposures</originalTitle>
<itemPage>204</itemPage>
<ebookList/>
<usedList>
<aladinUsed>
<itemCount>0</itemCount>
<minPrice>0</minPrice>
<link>https://www.aladin.co.kr/shop/UsedShop/wuseditemall.aspx?ItemId=334650717&TabType=2&partner=openAPI</link>
</aladinUsed>
<userUsed>
<itemCount>0</itemCount>
<minPrice>0</minPrice>
<link>https://www.aladin.co.kr/shop/UsedShop/wuseditemall.aspx?ItemId=334650717&TabType=1&partner=openAPI</link>
</userUsed>
<spaceUsed>
<itemCount>0</itemCount>
<minPrice>0</minPrice>
<link>https://www.aladin.co.kr/shop/UsedShop/wuseditemall.aspx?ItemId=334650717&TabType=3&partner=openAPI</link>
</spaceUsed>
</usedList>
</subInfo>
</item>
 */