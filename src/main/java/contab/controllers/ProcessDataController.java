package contab.controllers;

import contab.dto.CategoryDTO;
import contab.dto.OrdersDTO;
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
    private final IOrdersService ordersService;

    public ProcessDataController(
            IProductService productService,
            ICategoryService categoryService,
            IOrdersService ordersService
    ) {
        this.productService = productService;
        this.categoryService = categoryService;
        this.ordersService = ordersService;
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
    @GetMapping("/active-orders")
    public ResponseEntity<List<OrdersDTO>> getActiveOrders() {
    return ResponseEntity.ok(this.ordersService.getActiveOrders());
}

