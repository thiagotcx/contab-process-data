package contab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
public class OrderSummaryDTO {

    private String companyDocument;
    private BigDecimal orderTotal;
    private BigDecimal productTotal;
    private Long productQuantity;
    private Long productAmountTotal;

    public OrderSummaryDTO() {
    }

    public OrderSummaryDTO(String companyDocument, BigDecimal orderTotal, BigDecimal productTotal, Long productQuantity, Long productAmountTotal) {
        this.companyDocument = companyDocument;
        this.orderTotal = orderTotal;
        this.productTotal = productTotal;
        this.productQuantity = productQuantity;
        this.productAmountTotal = productAmountTotal;
    }



}
