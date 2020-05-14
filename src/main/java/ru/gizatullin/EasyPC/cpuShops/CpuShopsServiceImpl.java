package ru.gizatullin.EasyPC.cpuShops;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CpuShopsServiceImpl implements CpuShopsService {
    private final CpuShopsRepository cpuShopsRepository;
    private final CpuShopsToCpuShopsDtoConverter cpuShopsToCpuShopsDtoConverter;
    private final CpuShopsDtoToCpuShopsConverter cpuShopsDtoToCpuShopsConverter;

    @Override
    public List<CpuShopsDto> getAll() {
        return cpuShopsRepository.findAll().stream()
                .map(cpuShops -> cpuShopsToCpuShopsDtoConverter.convert(cpuShops))
                .collect(Collectors.toList());
    }

    @Override
    public CpuShopsDto get(long id) {
        CpuShops cpuShops = cpuShopsRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return cpuShopsToCpuShopsDtoConverter.convert(cpuShops);
    }

    @Override
    public CpuShopsDto update(CpuShopsDto cpuShopsDto) {
        CpuShops cpuShops = cpuShopsRepository.save(cpuShopsDtoToCpuShopsConverter.convert(cpuShopsDto));
        return cpuShopsToCpuShopsDtoConverter.convert(cpuShops);
    }

    @Override
    public CpuShopsDto add(CpuShopsDto cpuShopsDto) {
        CpuShops cpuShops = cpuShopsRepository.save(cpuShopsDtoToCpuShopsConverter.convert(cpuShopsDto));
        return cpuShopsToCpuShopsDtoConverter.convert(cpuShops);
    }

    @Override
    public void delete(long id) {
        cpuShopsRepository.deleteById(id);
    }
}
