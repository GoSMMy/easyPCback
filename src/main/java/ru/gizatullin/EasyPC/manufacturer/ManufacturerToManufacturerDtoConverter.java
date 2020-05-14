package ru.gizatullin.EasyPC.manufacturer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ManufacturerToManufacturerDtoConverter implements Converter<Manufacturer, ManufacturerDto> {
    @Override
    public ManufacturerDto convert(Manufacturer manufacturer) {
        return new ManufacturerDto()
                .setId(manufacturer.getId())
                .setName(manufacturer.getName());
    }
}
