package kg.megacom.deriveryApp.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "positions")
public class Positions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "position_id")
    private Long id;
    private String name;
    private boolean isActive;
}
