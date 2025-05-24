package contab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CategoryDTO {
    private String description;
    private Long productAmount;
}
