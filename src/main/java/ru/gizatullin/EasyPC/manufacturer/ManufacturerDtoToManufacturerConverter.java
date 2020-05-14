package ru.gizatullin.EasyPC.manufacturer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ManufacturerDtoToManufacturerConverter implements Converter<ManufacturerDto, Manufacturer> {
    @Override
    public Manufacturer convert(ManufacturerDto manufacturerDto) {
        return new Manufacturer()
                .setId(manufacturerDto.getId())
                .setName(manufacturerDto.getName());
    }
}
