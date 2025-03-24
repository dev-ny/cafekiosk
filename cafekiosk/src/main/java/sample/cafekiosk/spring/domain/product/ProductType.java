package sample.cafekiosk.spring.domain.product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ProductType {

    HANDMADE("제조 음료"),
    BOTTLE("병 음료"),
    BAKERY("베이커리");

    private final String text; // 내부적인 설명값, 주석보다는 필드로
}
