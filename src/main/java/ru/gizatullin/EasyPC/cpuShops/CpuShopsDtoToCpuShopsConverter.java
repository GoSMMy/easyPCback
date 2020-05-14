package ru.gizatullin.EasyPC.cpuShops;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CpuShopsDtoToCpuShopsConverter implements Converter<CpuShopsDto, CpuShops> {
    @Override
    public CpuShops convert(CpuShopsDto cpuShopsDto) {
        return new CpuShops()
                .setId(cpuShopsDto.getId())
                .setShopId(cpuShopsDto.getShopId())
                .setCpuId(cpuShopsDto.getCpuId())
                .setPrice(cpuShopsDto.getPrice());
    }
}
