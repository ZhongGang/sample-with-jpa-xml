package com.icode.core.dto;

import com.icode.core.model.Shop;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-1
 * Time: 下午1:35
 */
public class ShopOverviewDTO {
    private Integer id;
    private String guid;
    private String name;

    public ShopOverviewDTO(Shop shop) {
        this.id = shop.getId();
        this.guid = shop.getGuid();
        this.name = shop.getName();
    }

    public Integer getId() {
        return id;
    }

    public String getGuid() {
        return guid;
    }

    public String getName() {
        return name;
    }
}
