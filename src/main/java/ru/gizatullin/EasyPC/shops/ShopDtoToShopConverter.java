package ru.gizatullin.EasyPC.shops;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ShopDtoToShopConverter implements Converter<ShopDto, Shop> {
    @Override
    public Shop convert(ShopDto shopDto) {
        return new Shop()
                .setId(shopDto.getId())
                .setName(shopDto.getName());
    }
}
