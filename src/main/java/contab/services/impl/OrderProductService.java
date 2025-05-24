package contab.services.impl;

import contab.dto.OrderSummaryDTO;
import contab.persistence.repositories.OrderProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductService {

    private final OrderProductsRepository orderProductsRepository;

    public OrderProductService(OrderProductsRepository orderProductsRepository) {
        this.orderProductsRepository = orderProductsRepository;
    }

    public List<OrderSummaryDTO> getAllCreatedOrderSummaries(){
        return orderProductsRepository.getAllCreatedOrderSummaries();
    }
}
