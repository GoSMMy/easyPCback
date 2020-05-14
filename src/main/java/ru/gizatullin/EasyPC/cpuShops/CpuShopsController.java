package ru.gizatullin.EasyPC.cpuShops;

import java.util.List;

public interface CpuShopsController {
    List<CpuShopsDto> getAll();
    CpuShopsDto get(long id);
    CpuShopsDto update(CpuShopsDto cpuShopsDto);
    CpuShopsDto add (CpuShopsDto cpuShopsDto);
    void delete(long id);
}
