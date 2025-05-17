package contab.services.impl;

import contab.dto.OrderSummaryDTO;
import contab.persistence.repositories.OrderProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductsServices {

    private final OrderProductsRepository orderProductsRepository;

    public OrderProductsServices(OrderProductsRepository orderProductsRepository) {
        this.orderProductsRepository = orderProductsRepository;
    }

    public List<OrderSummaryDTO> getAllCreatedOrderSummaries(){
        return orderProductsRepository.getAllCreatedOrderSummaries();
    }
}
