package contab.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tb_order_products", schema = "public")
public class OrderProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_product_id", nullable = false)
    private Long orderProductId;

    @Column(nullable = false, name = "order_id")
    private Long orderId;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String barcode;

    @Column(nullable = false)
    private Integer amount;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false, name = "sub_total")
    private BigDecimal subTotal;

    @Column(nullable = false, name = "is_deleted")
    private Boolean isDeleted;

    @Column(nullable = false, name = "created_at")
    private LocalDateTime createdAt;

    public OrderProductEntity() {
    }

    public OrderProductEntity(
            Long orderProductId,
            Long orderId, String description,
            String barcode,
            Integer amount,
            BigDecimal price,
            BigDecimal subTotal,
            Boolean isDeleted,
            LocalDateTime createdAt
            ) {
        this.orderProductId = orderProductId;
        this.orderId = orderId;
        this.description = description;
        this.barcode = barcode;
        this.amount = amount;
        this.price = price;
        this.subTotal = subTotal;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
    }
}
