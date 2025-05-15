package contab.persistence.entities;

import contab.dto.StatusEnum;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name  = "tb_orders", schema = "public")
public class OrdersEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "order_id")
    private Long orderId;

    @Column(nullable = false, name = "company_document")
    private String document;

    @Column(nullable = false, name = "company")
    private String company;

    @Column(nullable = false, name = "order_total")
    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "order_status")
    private StatusEnum status;

    @Column(nullable = false, name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "status_updated_at")
    private LocalDateTime statusUpdatedAt;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getStatusUpdatedAt() {
        return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(LocalDateTime statusUpdatedAt) {
        this.statusUpdatedAt = statusUpdatedAt;
    }
}


//@Entity
//@Table(name  = "tb_orders", schema = "public")
//public class OrdersEntity {
//
//    @Id
//    @Column(nullable = false, name = "order_id")
//    private Long orderId;
//
//    @Column(nullable = false, name = "company_document")
//    private String companyDocument;
//
//    @Column(nullable = false, name = "order_total")
//    private BigDecimal orderTotal;
//
//    @Column(nullable = false, name = "order_status")
//    public String orderStatusType;
//
//    @Column(nullable = false, name = "created_at")
//    private LocalDateTime createdAt;
//
//    @Column(nullable = true, name = "status_updated_at")
//    private LocalDateTime statusUpdatedAt;
//
//    @Column(nullable = false, name = "pk_tb_orders_oi")
//    private PrimaryKeyJoinColumn pkTbOrdersOi;
//
//    public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
//    }
//
//    public String getCompanyDocument() {
//        return companyDocument;
//    }
//
//    public void setCompanyDocument(String companyDocument) {
//        this.companyDocument = companyDocument;
//    }
//
//    public BigDecimal getOrderTotal() {
//        return orderTotal;
//    }
//
//    public void setOrderTotal(BigDecimal orderTotal) {
//        this.orderTotal = orderTotal;
//    }
//
//    public String getOrderStatusType() {
//        return orderStatusType;
//    }
//
//    public void setOrderStatusType(String orderStatusType) {
//        this.orderStatusType = orderStatusType;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public LocalDateTime getStatusUpdatedAt() {
//        return statusUpdatedAt;
//    }
//
//    public void setStatusUpdatedAt(LocalDateTime statusUpdatedAt) {
//        this.statusUpdatedAt = statusUpdatedAt;
//    }
//
//    public PrimaryKeyJoinColumn getPkTbOrdersOi() {
//        return pkTbOrdersOi;
//    }
//
//    public void setPkTbOrdersOi(PrimaryKeyJoinColumn pkTbOrdersOi) {
//        this.pkTbOrdersOi = pkTbOrdersOi;
//    }
//}