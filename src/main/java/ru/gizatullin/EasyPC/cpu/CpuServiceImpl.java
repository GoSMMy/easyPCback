package ru.gizatullin.EasyPC.cpu;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CpuServiceImpl implements CpuService {
    private final CpuRepository cpuRepository;
    private final CpuToCpuDtoConverter cpuToCpuDtoConverter;
    private final CpuDtoToCpuConverter cpuDtoToCpuConverter;

    @Override
    public List<CpuDto> getAll() {
        return cpuRepository.findAll().stream()
                .map(cpu -> cpuToCpuDtoConverter.convert(cpu))
                .collect(Collectors.toList());
    }

    @Override
    public CpuDto get(long id) {
        Cpu cpu = cpuRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return cpuToCpuDtoConverter.convert(cpu);
    }

    @Override
    public CpuDto update(CpuDto cpuDto) {
        Cpu cpu = cpuRepository.save(cpuDtoToCpuConverter.convert(cpuDto));
        return cpuToCpuDtoConverter.convert(cpu);
    }

    @Override
    public CpuDto add(CpuDto cpuDto) {
        Cpu cpu = cpuRepository.save(cpuDtoToCpuConverter.convert(cpuDto));
        return cpuToCpuDtoConverter.convert(cpu);
    }

    @Override
    public void delete(long id) {
        cpuRepository.deleteById(id);
    }
}
