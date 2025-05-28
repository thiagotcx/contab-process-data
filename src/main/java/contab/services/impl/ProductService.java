package contab.services.impl;

import contab.dto.OrderProductsDTO;
import contab.persistence.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IOrderProductsService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<OrderProductsDTO> saveByOrder(Long orderId, List<OrderProductsDTO> productsDTOS) {
        return List.of();
    }
}
