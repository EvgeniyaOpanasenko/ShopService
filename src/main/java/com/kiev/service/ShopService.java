package com.kiev.service;

import com.kiev.model.Item;

import java.util.List;

public interface ShopService {
    Item getItemDataById(long id);
    Item getItemDataByMpn(String mpn);
    List<Item> getAllItems();
}
