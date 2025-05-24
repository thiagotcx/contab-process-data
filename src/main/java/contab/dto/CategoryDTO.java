package contab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class CategoryDTO {

    public CategoryDTO(String description, Long productAmount) {
        this.description = description;
        this.productAmount = productAmount;
    }

    private String description;
    private Long productAmount;
}
