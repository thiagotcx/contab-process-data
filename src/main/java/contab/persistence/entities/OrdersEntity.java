package contab.persistence.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_orders", schema = "public")
public class OrdersEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "order_id", nullable = false)
   private Long orderId;

   @Column(nullable = false)
   private String description;

   @Column(nullable = false)
   private String company;

   @Column(nullable = false)
   private Long total;

   @Column(name = "is_created", nullable = false)
   private boolean isCreated;

   @Column(name = "is_finished", nullable = false)
   private boolean isFinished;

   @Column(name = "is_canceled", nullable = false)
   private boolean isCanceled;

   @Column(name = "is_invalid", nullable = false)
   private boolean isInvalid;

   @Column(name = "created_at", nullable = false)
   private LocalDateTime createdAt;

   @Column(name = "status_updated_at", nullable = false)
   private LocalDateTime statusUpdatedAt;

   public Long getOrderId() {
      return orderId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getCompany() {
      return company;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   public Long getTotal() {
      return total;
   }

   public void setTotal(Long total) {
      this.total = total;
   }

   public boolean isCreated() {
      return isCreated;
   }

   public void setCreated(boolean created) {
      isCreated = created;
   }

   public boolean isFinished() {
      return isFinished;
   }

   public void setFinished(boolean finished) {
      isFinished = finished;
   }

   public boolean isCanceled() {
      return isCanceled;
   }

   public void setCanceled(boolean canceled) {
      isCanceled = canceled;
   }

   public boolean isInvalid() {
      return isInvalid;
   }

   public void setInvalid(boolean invalid) {
      isInvalid = invalid;
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
