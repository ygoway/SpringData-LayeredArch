package com.example.hw8.service;

import com.example.hw8.repository.entity.Shop;

import java.util.List;

public interface ShopService {

    Shop addShop(Shop shop);

    void deleteShopById(Long id);

    List<Shop> getAllShops();

    Shop getById(Long id);

    Shop updateShopById(Shop shop, Long id);

}
