package com.icode.dao;

import com.icode.core.model.Shop;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-30
 * Time: 下午10:58
 */
public interface ShopRepository extends PagingAndSortingRepository<Shop, Integer> {
}
