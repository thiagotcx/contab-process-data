package contab.services.impl;

import contab.dto.OrdersDTO;
import contab.persistence.repositories.OrdersRepository;
import contab.services.IOrdersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrdersService {

    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<OrdersDTO> findAll() {
        return List.of();
    }
}
