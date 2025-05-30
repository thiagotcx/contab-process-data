package contab.persistence.repositories;

import contab.dto.OrdersDTO;
import contab.persistence.entities.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity, Long> {

    @Query("""
            SELECT new contab.dto.OrdersDTO(
            p.description
            p.company
            SUM(op.amount * op.price)
         )
         FROM OrdersEntity o
         JOIN o.orderProducts op
         JOIN op.product p
         WHERE o.isDeleted = false
           AND op.isDeleted = false
           AND p.isDeleted = false
          GROUP By p.description, p.company
          """)
        List<OrdersDTO> getOrderSummary();

}
