package contab.services;

import contab.dto.OrderSummaryDTO;

import java.util.List;

public interface IOrderService {

    OrderSummaryDTO findOrderSummaryById(Long orderId);

    List<OrderSummaryDTO> listCreatedOrdersSummary();
}
