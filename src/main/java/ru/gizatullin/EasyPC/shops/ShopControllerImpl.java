package ru.gizatullin.EasyPC.shops;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shop")
@RequiredArgsConstructor
public class ShopControllerImpl implements ShopController {
    private final ShopService shopService;

    @Override
    @GetMapping
    public List<ShopDto> getAll() {
        return shopService.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public ShopDto get(@PathVariable("id") long id) {
        return shopService.get(id);
    }

    @Override
    @PutMapping
    public ShopDto update(@RequestBody ShopDto shopDto) {
        return shopService.update(shopDto);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        shopService.delete(id);
    }

    @Override
    @PostMapping
    public ShopDto add(@RequestBody ShopDto shopDto) {
        return shopService.add(shopDto);
    }
}
