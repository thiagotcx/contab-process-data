package contab.dto;

import contab.persistence.entities.OrdersEntity;

public class OrdersDTO {

    private String description;
    private String company;
    private Long total;

    public OrdersDTO() {

    }

    public OrdersDTO(String description, String company, Long total) {
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
