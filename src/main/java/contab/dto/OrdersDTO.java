package contab.dto;

import contab.persistence.entities.OrdersEntity;

import java.math.BigDecimal;

public class OrdersDTO {

    private String description;
    private String company;
    private BigDecimal total;

    public OrdersDTO() {

    }

    public OrdersDTO(String description, String company, BigDecimal total) {
        this.description = description;
        this.company = company;
        this.total = total;
    }

    public OrdersDTO(OrdersEntity ordersEntity) {

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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
