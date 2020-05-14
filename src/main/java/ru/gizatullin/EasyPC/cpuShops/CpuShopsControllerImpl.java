package ru.gizatullin.EasyPC.cpuShops;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cpu-shop")
@RequiredArgsConstructor
public class CpuShopsControllerImpl implements CpuShopsController {
    private final CpuShopsService cpuShopsService;

    @Override
    @GetMapping
    public List<CpuShopsDto> getAll() {
        return cpuShopsService.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public CpuShopsDto get(@PathVariable("id") long id) {
        return cpuShopsService.get(id);
    }

    @Override
    @PutMapping
    public CpuShopsDto update(@RequestBody CpuShopsDto cpuShopsDto) {
        return cpuShopsService.update(cpuShopsDto);
    }

    @Override
    @PostMapping
    public CpuShopsDto add(@RequestBody CpuShopsDto cpuShopsDto) {
        return cpuShopsService.add(cpuShopsDto);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        cpuShopsService.delete(id);
    }
}
