package ru.gizatullin.EasyPC.cpu;

import java.util.List;

public interface CpuService {
    List<CpuDto> getAll();

    CpuDto get(long id);

    CpuDto update(CpuDto cpuDto);

    void delete(long id);

    CpuDto add(CpuDto cpuDto);
}
