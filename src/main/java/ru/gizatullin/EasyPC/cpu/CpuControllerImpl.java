package ru.gizatullin.EasyPC.cpu;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cpu")
@RequiredArgsConstructor
public class CpuControllerImpl implements CpuController {
    private final CpuService cpuService;

    @Override
    @GetMapping
    public List<CpuDto> getAll() {
        return cpuService.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public CpuDto get(@PathVariable("id") long id) {
        return cpuService.get(id);
    }

    @Override
    @PutMapping
    public CpuDto update(@RequestBody CpuDto cpuDto) {
        return cpuService.update(cpuDto);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        cpuService.delete(id);
    }

    @Override
    @PostMapping
    public CpuDto add(@RequestBody CpuDto cpuDto) {
        return cpuService.add(cpuDto);
    }
}
