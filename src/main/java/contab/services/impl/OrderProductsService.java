package contab.services.impl;

import contab.dto.OrderProductsDTO;
import contab.persistence.repositories.OrderProductsRepository;
import contab.services.IOrderProductsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductsService implements IOrderProductsService {

    private final OrderProductsRepository orderProductsRepository;

    public OrderProductsService(OrderProductsRepository orderProductsRepository) {
        this.orderProductsRepository = orderProductsRepository;
    }

    @Override
    public List<OrderProductsDTO> findAll() {
        return List.of();
    }
}
