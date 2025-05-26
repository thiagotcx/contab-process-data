package contab.services.impl;

import contab.dto.OrderSummaryDTO;
import contab.persistence.repositories.OrderRepository;
import contab.services.IOrderService;
import contab.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderSummaryDTO findOrderSummaryById(Long orderId) {
        var orderSummaryDTO = orderRepository.findOrderSummaryById(orderId);

        if(orderSummaryDTO == null) {
            throw new ResourceNotFoundException("Pedido não encontrado.");
        }

        return orderSummaryDTO;
    }

    @Override
    public List<OrderSummaryDTO> listCreatedOrdersSummary() {
        List<OrderSummaryDTO> orderSummaryDTOs = orderRepository.findAllCreatedOrdersSummary();

        if(orderSummaryDTOs.isEmpty()) {
            throw new ResourceNotFoundException("Nenhum pedido encontrado.");
        }

        return orderSummaryDTOs;
    }
}
