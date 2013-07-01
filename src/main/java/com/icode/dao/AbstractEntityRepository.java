package com.icode.dao;

import com.icode.core.model.AbstractEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-30
 * Time: 下午10:58
 */
public interface AbstractEntityRepository<T extends AbstractEntity, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {
}
