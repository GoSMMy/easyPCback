package ru.gizatullin.EasyPC.cpuShops;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CpuShopsToCpuShopsDtoConverter implements Converter<CpuShops, CpuShopsDto> {
    @Override
    public CpuShopsDto convert(CpuShops cpuShops) {
        return new CpuShopsDto()
                .setId(cpuShops.getId())
                .setShopId(cpuShops.getShopId())
                .setCpuId(cpuShops.getCpuId())
                .setPrice(cpuShops.getPrice());
    }
}
