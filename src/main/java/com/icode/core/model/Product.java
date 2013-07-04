package com.icode.core.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-1
 * Time: 下午9:08
 */
@Entity
@Table(name = "product")
public class Product extends AbstractEntity {

    private String name;
}
