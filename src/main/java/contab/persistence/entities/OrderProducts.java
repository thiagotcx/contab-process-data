package contab.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;
//tb_order_products

//- orderProductId
//- orderId
//- description
//- barcode
//- amount
//- price
//- subTotal
//- isDeleted
//- createdAt
@Entity
@Table(name = "tb_order_products", schema = "public")
public class OrderProducts {

    @Id
    @Column(name = "order_product_id", nullable = false)
    private Long orderProductId;

    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String barcode;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "sub_total", nullable = false)
    private BigDecimal subTotal;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted;

}
