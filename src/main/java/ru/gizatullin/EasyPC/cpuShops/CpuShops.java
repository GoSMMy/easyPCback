package ru.gizatullin.EasyPC.cpuShops;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CPUSHOPS")
@SequenceGenerator(name = "CPUSHOPS_SEQ", sequenceName = "CPUSHOPS_SEQ", allocationSize = 1)
@Accessors(chain = true)
public class CpuShops {
    @Id
    @GeneratedValue(generator = "CPUSHOPS_SEQ", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "SHOP_ID")
    private long shopId;
    @Column(name = "CPU_ID")
    private long cpuId;
    @Column(name = "PRICE")
    private long price;
}
