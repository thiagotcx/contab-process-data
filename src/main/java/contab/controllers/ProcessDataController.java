package contab.controllers;

import contab.dto.ProductDTO;
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

    public ProcessDataController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getArtists() {
        return ResponseEntity.ok(this.productService.getActiveProducts());
    }
}
