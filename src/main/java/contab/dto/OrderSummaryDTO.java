package contab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrderSummaryDTO {

    private String companyDocument;
    private BigDecimal orderTotal;
    private BigDecimal productTotal;
    private Long productQuantity;
    private Long productAmountTotal;
}
