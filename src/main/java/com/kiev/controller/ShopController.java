package com.kiev.controller;

import com.kiev.model.Item;
import com.kiev.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {

    @Autowired
    private ShopService service;

    @RequestMapping(value="/items", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Item> getItems() {
        return service.getAllItems();
    }

    @RequestMapping(value = "/getprice{mpn}", method = RequestMethod.GET)
    public Item getItem(@PathVariable("mpn") String mpn) {
        return service.getItemDataByMpn(mpn);
    }

    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    public Item getEmployee(@PathVariable("id") long id) {
        return service.getItemDataById(id);
    }

}
