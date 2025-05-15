package contab.services.impl;

import contab.dto.ProductDTO;
import contab.persistence.repositories.ProductRepository;
import contab.services.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductDTO> getActiveProducts() {
        return productRepository.getActiveProducts();
    }
}
