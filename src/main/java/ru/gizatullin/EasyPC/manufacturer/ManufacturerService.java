package ru.gizatullin.EasyPC.manufacturer;

import java.util.List;

public interface ManufacturerService {
    List<ManufacturerDto> getAll();
    ManufacturerDto get(long id);
}
