package contab.services.impl;

import contab.dto.OrderSummaryDTO;
import contab.persistence.repositories.OrderRepository;
import contab.services.IOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrderSummaryDTO findOrderSummaryById(Long orderId) {
        OrderSummaryDTO dto = repository.findOrderSummaryById(orderId);

        if(dto == null) {
            throw new RuntimeException("Pedido não encontrado.");
        }

        return dto;
    }

    @Override
    public List<OrderSummaryDTO> listCreatedOrdersSummary() {
        List<OrderSummaryDTO> dtos = repository.findAllCreatedOrdersSummary();

        if(dtos.isEmpty()) {
            throw new RuntimeException("Nenhum pedido encontrado.");
        }

        return dtos;
    }
}
