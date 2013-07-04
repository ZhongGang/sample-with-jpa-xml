package com.icode.dao;

import com.icode.core.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-30
 * Time: 下午10:58
 */
@RestResource(path = "product")
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
}
