package ru.gizatullin.EasyPC.cpuShops;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CpuShopsDto {
    private long id;
    private long shopId;
    private long cpuId;
    private long price;
}
