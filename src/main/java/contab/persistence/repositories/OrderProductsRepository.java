package contab.persistence.repositories;

import contab.dto.OrderSummaryDTO;
import contab.persistence.entities.OrderProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderProductsRepository extends JpaRepository <OrderProducts,Long>{

    @NativeQuery(value = """
        SELECT
            o.company_document AS companyDocument,
            o.order_total AS orderTotal,
            SUM(op.sub_total) AS productTotal,
            COUNT(*) AS productQuantity,
            SUM(op.amount) AS productAmountTotal
        FROM tb_orders o
        INNER JOIN tb_order_products op ON o.order_id = op.order_id
        WHERE o.order_status = 'CREATED'
            AND op.is_deleted = false
        GROUP BY o.company_document, o.order_total
        """)
    List<OrderSummaryDTO> getAllCreatedOrderSummaries();

}
