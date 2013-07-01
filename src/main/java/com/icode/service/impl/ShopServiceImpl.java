package com.icode.service.impl;

import com.icode.core.dto.ShopFormDTO;
import com.icode.core.dto.ShopOverviewDTO;
import com.icode.core.model.Shop;
import com.icode.dao.ShopRepository;
import com.icode.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-23
 * Time: 上午1:08
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository repository;

    @Override
    @Transactional
    public void saveOrUpdateShop(ShopFormDTO shopFormDTO) {
        Shop shop = shopFormDTO.toShop();
        repository.save(shop);
    }

    @Override
    public ShopFormDTO loadShop(Integer id) {
        Shop shop = repository.findOne(id);
        return new ShopFormDTO(shop);
    }

    @Override
    public List<ShopOverviewDTO> loadShops() {
        Iterator<Shop> iterator = repository.findAll().iterator();
        List<ShopOverviewDTO> shopOverviewDTOs = new ArrayList<ShopOverviewDTO>();
        while ((iterator.hasNext())) {
            Shop shop = iterator.next();
            ShopOverviewDTO shopOverviewDTO = new ShopOverviewDTO(shop);
            shopOverviewDTOs.add(shopOverviewDTO);
        }
        return shopOverviewDTOs;
    }
}
