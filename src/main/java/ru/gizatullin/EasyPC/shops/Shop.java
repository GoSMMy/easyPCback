package ru.gizatullin.EasyPC.shops;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Table(name = "SHOPS")
@SequenceGenerator(name = "SHOP_SEQ", sequenceName = "SHOP_SEQ", allocationSize = 1)
@Accessors(chain = true)
public class Shop {
    @Id
    @GeneratedValue(generator = "SHOP_SEQ", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "NAME")
    private String name;
}
