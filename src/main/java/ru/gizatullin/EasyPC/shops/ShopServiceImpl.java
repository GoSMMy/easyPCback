package ru.gizatullin.EasyPC.shops;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final ShopRepository shopRepository;
    private final ShopToShopDtoConverter shopToShopDtoConverter;
    private final ShopDtoToShopConverter shopDtoToShopConverter;

    @Override
    public List<ShopDto> getAll() {
        return shopRepository.findAll().stream()
                .map(shop -> shopToShopDtoConverter.convert(shop))
                .collect(Collectors.toList());
    }

    @Override
    public ShopDto get(long id) {
        Shop shop = shopRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return shopToShopDtoConverter.convert(shop);
    }

    @Override
    public ShopDto update(ShopDto shopDto) {
        Shop shop = shopRepository.save(shopDtoToShopConverter.convert(shopDto));
        return shopToShopDtoConverter.convert(shop);
    }

    @Override
    public void delete(long id) {
        shopRepository.deleteById(id);
    }

    @Override
    public ShopDto add(ShopDto shopDto) {
        Shop shop = shopRepository.save(shopDtoToShopConverter.convert(shopDto));
        return shopToShopDtoConverter.convert(shop);
    }
}
