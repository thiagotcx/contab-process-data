package contab.dto;

import java.math.BigDecimal;

public record OrderSummaryDTO(
        String companyDocument,
        BigDecimal orderTotal,
        BigDecimal productTotal,
        Long productQuantity,
        Double productAmountTotal
) {}
