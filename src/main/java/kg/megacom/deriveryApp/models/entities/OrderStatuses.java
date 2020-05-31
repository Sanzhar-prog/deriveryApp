package kg.megacom.deriveryApp.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "orderStatuses")
public class OrderStatuses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderStatus_id")
    private Long id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date start_date;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date end_date;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Statuses statuses;
}
