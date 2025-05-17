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
public class OrderDTO {

    private String document;
    private String company;
    private BigDecimal total;
    private StatusEnum status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
