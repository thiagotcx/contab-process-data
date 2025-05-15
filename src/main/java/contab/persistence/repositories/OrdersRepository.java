package contab.persistence.repositories;


import contab.dto.OrdersDTO;
import contab.persistence.entities.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<OrdersEntity, Long> {

//    @Query(value = """
//            select
//                o.company_document
//                , o.order_total
//                , sum(op.sub_total) as product_total
//                , count(op.*) as product_quantity
//                , sum(op.amount) as product_amount_total
//            from OrdersEntity o
//                inner join tb_order_products op
//                    on o.order_id = op.order_id
//            where o.order_status = 'CREATED'
//                and op.is_deleted = false
//                and o.order_id = 2
//            group by o.company_document, o.order_total
//    """)
//    List<OrdersDTO> getActiveOrders();
}
