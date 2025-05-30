package contab.services;

import contab.dto.OrdersDTO;

import java.util.List;

public interface IOrdersService {
    List<OrdersDTO> findAll();
}
