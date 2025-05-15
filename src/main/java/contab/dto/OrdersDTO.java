package contab.dto;

import java.math.BigDecimal;

public class OrdersDTO {
    private String companyDocument;
    private BigDecimal orderTotal;
    private String orderStatusType;


    public OrdersDTO(String companyDocument, BigDecimal orderTotal, String orderStatusType) {
        this.companyDocument = companyDocument;
        this.orderTotal = orderTotal;
        this.orderStatusType = orderStatusType;

    }

    public String getCompanyDocument() {
        return companyDocument;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public String getOrderStatusType() {
        return orderStatusType;
    }
}
