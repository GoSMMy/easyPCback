package ru.gizatullin.EasyPC.manufacturer;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MANUFACTURERS")
@SequenceGenerator(name = "MANUFACTURER_SEQ", sequenceName = "MANUFACTURER_SEQ", allocationSize = 1)
@Accessors(chain = true)
public class Manufacturer {
    @Id
    @GeneratedValue(generator = "MANUFACTURER_SEQ", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "NAME")
    private String name;
}
