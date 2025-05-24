package contab.persistence.repositories;

import contab.dto.OrderSummaryDTO;
import contab.persistence.entities.OrderProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderProductsRepository extends JpaRepository <OrderProductEntity,Long>{

    @Query("""
    SELECT new contab.dto.OrderSummaryDTO(
        o.document,
        o.total,
        SUM(op.subTotal),
        COUNT(op),
        SUM(op.amount)
    )
    FROM OrderProductEntity op
    JOIN OrderEntity o
      ON op.orderId = o.orderId
    WHERE o.status = 'CREATED' AND op.isDeleted = false
    GROUP BY o.document, o.total
""")
    List<OrderSummaryDTO> getAllCreatedOrderSummaries();

}
