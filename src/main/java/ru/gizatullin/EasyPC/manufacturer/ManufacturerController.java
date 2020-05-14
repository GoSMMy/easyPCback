package ru.gizatullin.EasyPC.manufacturer;

import java.util.List;

public interface ManufacturerController {
    List<ManufacturerDto> getAll();
    ManufacturerDto get(long id);
}
