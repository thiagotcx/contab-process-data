package contab.dto;

import java.math.BigDecimal;

public class ProductDTO {
    private String category;
    private String description;
    private BigDecimal price;

    public ProductDTO(String category, String description, BigDecimal price) {
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
