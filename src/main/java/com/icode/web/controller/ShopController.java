package com.icode.web.controller;

import com.icode.core.dto.ShopFormDTO;
import com.icode.core.dto.ShopOverviewDTO;
import com.icode.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午4:15
 */
@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("shopForm", "shop", new ShopFormDTO());
    }

    @RequestMapping(value = "form/{id}", method = RequestMethod.GET)
    public ModelAndView showForm(@PathVariable("id") Integer id) {
        ShopFormDTO shop = shopService.loadShop(id);
        return new ModelAndView("shopForm", "shop", shop);
    }

    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String submitForm(ShopFormDTO shop) {
        shopService.saveOrUpdateShop(shop);
        return "redirect:overview";
    }

    @RequestMapping(value = "overview")
    public ModelAndView overview() {
        List<ShopOverviewDTO> shops = shopService.loadShops();
        return new ModelAndView("shopsOverview", "shops", shops);
    }

}
