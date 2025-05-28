package contab.services.impl;

import contab.dto.OrderProductsDTO;

import java.util.List;

public interface IOrderProductsService {
    List<OrderProductsDTO> saveByOrder(Long orderId, List<OrderProductsDTO> productsDTOS);

}
