package com.example.hw8.web;

import com.example.hw8.repository.entity.Shop;
import com.example.hw8.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    public ShopService shopService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Shop createShop(@RequestBody Shop shop) {
       return shopService.addShop(shop);
    }

    @DeleteMapping("/delete/{shopID}")
    public void deleteShop(@PathVariable("shopID") Long shopID) {
        shopService.deleteShopById(shopID);
    }

    @GetMapping("/")
    public List<Shop> getAllShops () {
        return shopService.getAllShops();
    }

    @GetMapping("/{shopID}")
    public Shop getShopById (@PathVariable("shopID") Long shopID) {
        return shopService.getById(shopID);
    }

    @PatchMapping("/{shopID}")
    public Shop patchShopById (@PathVariable("shopId") Long shopID, @RequestBody Shop shop) {
        return shopService.updateShopById(shop, shopID);
    }
}
