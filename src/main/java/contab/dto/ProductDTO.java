package contab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ProductDTO {

    public ProductDTO(String category, String description, BigDecimal price) {
        this.category = category;
        this.description = description;
        this.price = price;
    }

    private String category;
    private String description;
    private BigDecimal price;
}
