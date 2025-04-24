package contab.dto;

public class CategoryDTO {
    private String description;
    private Long productAmount;

    public CategoryDTO(String description, Long productAmount) {
        this.description = description;
        this.productAmount = productAmount;
    }

    public String getDescription() {
        return description;
    }

    public Long getProductAmount() {
        return productAmount;
    }
}
