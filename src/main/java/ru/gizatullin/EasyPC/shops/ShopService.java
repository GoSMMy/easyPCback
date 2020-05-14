package ru.gizatullin.EasyPC.shops;

import java.util.List;

public interface ShopService {
    List<ShopDto> getAll();

    ShopDto get(long id);

    ShopDto update(ShopDto shopDto);

    void delete(long id);

    ShopDto add(ShopDto shopDto);
}
