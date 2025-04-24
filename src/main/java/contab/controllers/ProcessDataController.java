package contab.controllers;

import contab.dto.CategoryDTO;
import contab.dto.ProductDTO;
import contab.services.ICategoryService;
import contab.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/process")
public class ProcessDataController {

    private final IProductService productService;
    private final ICategoryService categoryService;

    public ProcessDataController(
            IProductService productService,
            ICategoryService categoryService
    ) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @GetMapping("/active-products")
    public ResponseEntity<List<ProductDTO>> getActiveProducts() {
        return ResponseEntity.ok(this.productService.getActiveProducts());
    }
    @GetMapping("/active-categories")
    public ResponseEntity<List<CategoryDTO>> getActiveCategories() {
        return ResponseEntity.ok(this.categoryService.getActiveCategories());
    }
}
