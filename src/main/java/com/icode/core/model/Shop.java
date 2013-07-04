package com.icode.core.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午4:11
 */
@Entity
@Table(name = "shop")
public class Shop extends AbstractEntity {
    @Column
    private String name;

    @Column
    private String description;

    @OneToMany
    @JoinColumn(name = "shop_id")
    private List<Product> products = new ArrayList<Product>();

    public Shop() {
    }

    public Shop(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
