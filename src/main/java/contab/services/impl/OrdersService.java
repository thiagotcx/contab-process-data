package contab.services.impl;

import contab.dto.OrdersDTO;
import contab.persistence.entities.OrdersEntity;
import contab.persistence.repositories.OrdersRepository;
import contab.services.IOrdersService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersService implements IOrdersService {

    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<OrdersDTO> findAll() {
     List<OrdersEntity> ordersEntityList = ordersRepository.findAll();
     return ordersEntityList.stream()
             .map(ordersEntity -> new OrdersDTO(ordersEntity))
             .collect(Collectors.toList());

    }
}
