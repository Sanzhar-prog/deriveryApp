package kg.megacom.deriveryApp.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "prices")
public class Prices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "price_id")
    private Long id;
    private double price;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date start_date;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date end_date;
    @OneToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;
}
