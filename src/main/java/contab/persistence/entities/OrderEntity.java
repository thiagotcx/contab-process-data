package contab.persistence.entities;

import contab.dto.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tb_orders", schema = "public")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "order_id")
    private Long id;

    @Column(nullable = false, name = "company_document")
    private String document;

    @Column(nullable = false)
    private String company;

    @Column(nullable = false, name = "order_total")
    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status", nullable = false)
    private StatusEnum status;

    @Column(nullable = false, name = "created_at")
    private LocalDateTime createdAt;

    @Column(nullable = false, name = "update_at")
    private LocalDateTime updatedAt;

    public OrderEntity() {
    }

    public OrderEntity(
            String document,
            String company,
            BigDecimal total,
            StatusEnum status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt
            ) {
        this.document = document;
        this.company = company;
        this.total = total;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
