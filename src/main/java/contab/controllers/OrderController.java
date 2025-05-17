package contab.controllers;

import contab.dto.OrderSummaryDTO;
import contab.services.IOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final IOrderService orderService;

    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}/summary")
    public ResponseEntity<OrderSummaryDTO> getOrderSummary(@PathVariable Long id) {
        OrderSummaryDTO orderSummary = orderService.findOrderSummaryById(id);
        return ResponseEntity.ok(orderSummary);
    }

    @GetMapping("/created/summary")
    public ResponseEntity<List<OrderSummaryDTO>> getCreatedOrdersSummary() {
        List<OrderSummaryDTO> orderSummaries = orderService.listCreatedOrdersSummary();
        return ResponseEntity.ok(orderSummaries);
    }
}
