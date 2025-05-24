package contab.services.impl;

import contab.dto.ProductDTO;
import contab.persistence.repositories.ProductRepository;
import contab.services.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> getActiveProducts() {
        return productRepository.getActiveProducts();
    }
}
