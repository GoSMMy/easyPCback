package ru.gizatullin.EasyPC.videocard;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Table(name = "VIDEOCARDS")
@SequenceGenerator(name = "VIDEOCARD_SEQ", sequenceName = "VIDEOCARD_SEQ", allocationSize = 1)
@Accessors(chain = true)
public class VideoCard {
    @Id
    @GeneratedValue(generator = "VIDEOCARD_SEQ", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "MANUFACTURER_ID")
    private long manufacturer_id;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "CAPACITY")
    private float videoMemoryCapacity;
}
