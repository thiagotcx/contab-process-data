package contab.persistence.entities;

//tb_orders
//
//- orderId
//- document
//- company
//- total
//- status (CREATED, FINISHED, CANCELLED, INVALID)
//- createdAt (DateTime)
//- statusUpdatedAt (DateTime)
//
//Regras de negócio:
//- Ordem de pedido só pode ser deletada quando no status CREATED
//- Status FINISHED, CANCELLED, INVALID são status finai

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_orders", schema = "public")
public class Orders {

    @Id
    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(nullable = false)
    private String document;

    @Column(nullable = false)
    private String company;

    @Column(nullable = false)
    private Double total;

    @Column(nullable = false)
    private String status;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "status_updated_at", nullable = false)
    private LocalDateTime statusUpdatedAt;
}
