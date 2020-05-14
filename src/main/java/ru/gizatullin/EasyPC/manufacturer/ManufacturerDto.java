package ru.gizatullin.EasyPC.manufacturer;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ManufacturerDto {
    private long id;
    private String name;
}
