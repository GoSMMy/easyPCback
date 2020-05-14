package ru.gizatullin.EasyPC.cpu;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CpuDto {
    private long id;
    private long manufacturer_id;
    private String model;
    private String socket;
    private long cores;
}
