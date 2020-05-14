package ru.gizatullin.EasyPC.videocard;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class VideoCardDto {
    private long id;
    private long manufacturer_id;
    private String model;
    private float videoMemoryCapacity;
}
