package ru.gizatullin.EasyPC.shops;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ShopToShopDtoConverter implements Converter<Shop, ShopDto> {
    @Override
    public ShopDto convert(Shop shop) {
        return new ShopDto()
                .setId(shop.getId())
                .setName(shop.getName());
    }
}
