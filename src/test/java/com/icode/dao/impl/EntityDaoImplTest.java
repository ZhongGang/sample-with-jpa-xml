package com.icode.dao.impl;

import com.icode.core.model.Shop;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-23
 * Time: 下午1:41
 */
@ContextConfiguration(value = "classpath:rootApplicationContext.xml")
public class EntityDaoImplTest extends AbstractTransactionalTestNGSpringContextTests {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    @Transactional
    public void testSaveOrUpdate() throws Exception {
        Shop shop = new Shop("Shop1", "Shop111111111");
        entityManager.persist(shop);
    }
}
