package contab.services;

import contab.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> getActiveProducts();
}
