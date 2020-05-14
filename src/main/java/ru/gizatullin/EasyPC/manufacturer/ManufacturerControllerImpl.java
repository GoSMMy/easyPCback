package ru.gizatullin.EasyPC.manufacturer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/manufacturer")
@RequiredArgsConstructor
public class ManufacturerControllerImpl implements ManufacturerController {
    private final ManufacturerService manufacturerService;

    @Override
    @GetMapping
    public List<ManufacturerDto> getAll() {
        return manufacturerService.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public ManufacturerDto get(@PathVariable("id") long id) {
        return manufacturerService.get(id);
    }
}
