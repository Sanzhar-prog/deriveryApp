package kg.megacom.deriveryApp.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long id;
    private String name;
    private String phone;
    private String address;
    private String houseNo;
    private String flatNo;
}
