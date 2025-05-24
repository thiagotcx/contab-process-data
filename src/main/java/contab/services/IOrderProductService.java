package contab.services;

import contab.dto.OrderSummaryDTO;

import java.util.List;

public interface IOrderProductService {
    List<OrderSummaryDTO> getActiveOrderSummary();
}
