package ru.gizatullin.EasyPC.manufacturer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ManufacturerServiceImpl implements ManufacturerService {
    private final ManufacturerRepository manufacturerRepository;
    private final ManufacturerToManufacturerDtoConverter manufacturerToManufacturerDtoConverter;

    @Override
    public List<ManufacturerDto> getAll() {
        return manufacturerRepository.findAll().stream()
                .map(manufacturer -> manufacturerToManufacturerDtoConverter.convert(manufacturer))
                .collect(Collectors.toList());
    }

    @Override
    public ManufacturerDto get(long id) {
        Manufacturer manufacturer = manufacturerRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return manufacturerToManufacturerDtoConverter.convert(manufacturer);
    }
}
