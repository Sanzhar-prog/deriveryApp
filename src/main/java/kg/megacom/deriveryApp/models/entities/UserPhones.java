package kg.megacom.deriveryApp.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "userPhones")
public class UserPhones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userPhone_id")
    private Long id;
    private String phone;
    private boolean isActive;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}
