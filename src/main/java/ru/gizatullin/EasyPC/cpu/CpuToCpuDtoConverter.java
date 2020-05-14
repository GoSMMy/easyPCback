package ru.gizatullin.EasyPC.cpu;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CpuToCpuDtoConverter implements Converter<Cpu, CpuDto> {
    @Override
    public CpuDto convert(Cpu cpu) {
        return new CpuDto()
                .setId(cpu.getId())
                .setManufacturer_id(cpu.getManufacturer_id())
                .setModel(cpu.getModel())
                .setSocket(cpu.getSocket())
                .setCores(cpu.getCores());
    }
}
