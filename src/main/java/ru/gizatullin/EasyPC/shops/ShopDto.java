package ru.gizatullin.EasyPC.shops;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ShopDto {
    private long id;
    private String name;
}
