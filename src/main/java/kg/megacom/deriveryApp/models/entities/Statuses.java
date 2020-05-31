package kg.megacom.deriveryApp.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "statuses")
public class Statuses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "status_id")
    private Long id;
    private String name;
    private boolean isActive;
}
