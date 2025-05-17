package contab.dto;

import java.math.BigDecimal;

public interface OrderSummaryDTO {

    String getCompanyDocument();

    BigDecimal getOrderTotal();

    BigDecimal getProductTotal();

    Long getProductQuantity();

    BigDecimal getProductAmountTotal();
}
