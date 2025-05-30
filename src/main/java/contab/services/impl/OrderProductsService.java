package contab.services.impl;

import contab.dto.OrderProductsDTO;
import contab.persistence.entities.OrderProductsEntity;
import contab.persistence.repositories.OrderProductsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderProductsService implements IOrderProductsService {

    private final OrderProductsRepository orderProductsRepository;

    public OrderProductsService(OrderProductsRepository orderProductsRepository) {
        this.orderProductsRepository = orderProductsRepository;
    }

    @Override
    public List<OrderProductsDTO> saveByOrder(Long orderId, List<OrderProductsDTO> productsDTOS) {
        List<OrderProductsEntity> orderProductsEntityList = new ArrayList<>();

        for (OrderProductsDTO dto : productsDTOS) {
            OrderProductsEntity entity = new OrderProductsEntity();
            entity.setOrderId(orderId);
            entity.setAmount(dto.getAmount());
            entity.setBarcode(dto.getBarcode());
            entity.setDescription(dto.getDescription());
            entity.setPrice(dto.getPrice());
            orderProductsEntityList.add(entity);

        }

        List<OrderProductsEntity> savedEntities = orderProductsRepository.saveAll(orderProductsEntityList);

        List<OrderProductsDTO> savedDTOs = new ArrayList<>();

        for (OrderProductsEntity entity : savedEntities) {
            OrderProductsDTO dto = new OrderProductsDTO();
            dto.setAmount(entity.getAmount());
            dto.setBarcode(entity.getBarcode());
            dto.setDescription(dto.getDescription());
            dto.setPrice(entity.getPrice());
            savedDTOs.add(dto);
        }

        return savedDTOs;
    }

}

