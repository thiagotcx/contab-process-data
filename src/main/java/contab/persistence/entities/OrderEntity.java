package contab.persistence.entities;

import contab.dto.StatusEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_orders", schema = "public")
public class OrderEntity {

    @Id
    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(nullable = false)
    private String document;

    @Column(nullable = false)
    private String company;

    @Column(nullable = false)
    private BigDecimal total;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "status_updated_at", nullable = true)
    private LocalDateTime statusUpdatedAt;
}
