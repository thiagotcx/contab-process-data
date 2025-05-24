package contab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class ProductDTO {
    private String category;
    private String description;
    private BigDecimal price;
}
