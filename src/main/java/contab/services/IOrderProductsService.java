package contab.services;

import contab.dto.OrderProductsDTO;

import java.util.List;

public interface IOrderProductsService {
    List<OrderProductsDTO> findAll();
}
