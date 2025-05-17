package contab.persistence.repositories;

import contab.dto.OrderDTO;
import contab.dto.OrderSummaryDTO;
import contab.persistence.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    @Query(value = """
        SELECT
            new contab.dto.OrderSummaryDTO
            (
                o.document,
                o.total,
                SUM(op.subTotal),
                COUNT(op),
                SUM(op.amount)
                )
        FROM OrderEntity o
                INNER JOIN OrderProductEntity op
                    ON o.id = op.orderId
        WHERE o.status = 'CREATED'
            AND op.isDeleted = false
            AND o.id = :orderId
        GROUP BY o.document, o.total
    """)
    public OrderSummaryDTO findOrderSummaryById(@Param("orderId") Long orderId);

    @Query(value = """
        SELECT
            new contab.dto.OrderSummaryDTO
            (
                o.document,
                o.total,
                SUM(op.subTotal),
                COUNT(op),
                SUM(op.amount)
                )
        FROM OrderEntity o
                INNER JOIN OrderProductEntity op
                    ON o.id = op.orderId
        WHERE o.status = 'CREATED'
            AND op.isDeleted = false
        GROUP BY o.document, o.total
    """)
    List<OrderSummaryDTO> findAllCreatedOrdersSummary();
}
