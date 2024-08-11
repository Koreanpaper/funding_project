package com.klolarion.funding_project.application.port.out;

import com.klolarion.funding_project.domain.entity.Product;

import java.util.List;

public interface ProductRepository {

    /*전체 상품 조회*/
    List<Product> productList();

    /*상품 출고*/
    boolean exportProduct(Long productId);

    /*상품 재고 추가*/
    boolean addStock(Long productId, int amount);

    /*재입고 설정*/
    boolean setRestock(Long productId);

    /*판매완료 설정*/
    boolean setSellFinished(Long productId);

}
