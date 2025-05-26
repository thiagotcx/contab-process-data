package contab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderProductDTO {

    private Long orderProductId;
    private Long orderId;
    private String description;
    private String barcode;
    private Integer amount;
    private BigDecimal price;
    private BigDecimal subTotal;
    private Boolean isDeleted;
    private LocalDateTime createdAt;

}
