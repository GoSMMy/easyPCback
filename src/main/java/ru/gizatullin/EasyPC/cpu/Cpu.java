package ru.gizatullin.EasyPC.cpu;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;


@Data
@Entity
@Table(name = "CPUS")
@SequenceGenerator(name = "CPU_SEQ", sequenceName = "CPU_SEQ", allocationSize = 1)
@Accessors(chain = true)
public class Cpu {
    @Id
    @GeneratedValue(generator = "CPU_SEQ", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "MANUFACTURER_ID")
    private long manufacturer_id;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "SOCKET")
    private String socket;
    @Column(name = "CORES")
    private long cores;
}
