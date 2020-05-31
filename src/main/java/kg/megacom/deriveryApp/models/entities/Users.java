package kg.megacom.deriveryApp.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Positions positions;
    private boolean isActive;
}
