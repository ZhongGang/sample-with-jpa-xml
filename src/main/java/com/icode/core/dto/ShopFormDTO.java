package com.icode.core.dto;

import com.icode.core.model.Shop;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午11:11
 */
public class ShopFormDTO {
    private String guid;
    private String name;
    private String description;

    public ShopFormDTO() {
    }

    public ShopFormDTO(Shop shop) {
        this.guid = shop.getGuid();
        this.name = shop.getName();
        this.description = shop.getDescription();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Shop toShop() {
        return new Shop(this.name, this.description);
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
