package com.example.test.domain.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVo {
    String title;
    String link;
    String logo;
    String pubDate;
    String totalResults;
    String startIndex;
    String itemsPerPage;
    String query;
    String version;
    String searchCategoryId;
    String searchCategoryName;
    //List<ResponseItemVO> item;

}


/*<object xmlns="http://www.aladin.co.kr/ttb/apiguide.aspx">
<title>알라딘 상품정보 - 듄 : 익스포저</title>
<link>https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=334650717&partner=openAPI</link>
<logo>http://image.aladin.co.kr/img/header/2011/aladin_logo_new.gif</logo>
<pubDate>Wed, 22 May 2024 04:18:17 GMT</pubDate>
<totalResults>1</totalResults>
<startIndex>1</startIndex>
<itemsPerPage>1</itemsPerPage>
<query>isbn13=9791155817049</query>
<version>20131101</version>
<searchCategoryId>0</searchCategoryId>
<searchCategoryName/>
<item itemId="334650717">
...
</item>
</object>
 *
 *
 */