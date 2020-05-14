package ru.gizatullin.EasyPC.cpu;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CpuDtoToCpuConverter implements Converter<CpuDto, Cpu> {
    @Override
    public Cpu convert(CpuDto cpuDto) {
        return new Cpu()
                .setId(cpuDto.getId())
                .setManufacturer_id(cpuDto.getManufacturer_id())
                .setModel(cpuDto.getModel())
                .setSocket(cpuDto.getSocket())
                .setCores(cpuDto.getCores());
    }
}
