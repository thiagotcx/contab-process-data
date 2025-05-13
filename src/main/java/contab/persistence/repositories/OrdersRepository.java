package contab.persistence.repositories;


import contab.dto.OrdersDTO;
import contab.persistence.entities.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<OrdersEntity, Long> {

    @Query(value = """
       
    """)
    List<OrdersDTO> getActiveOrders();
}

 /*SELECT
            new contab.dto.OrdersDTO(
        C.description,
        COUNT(P)
            )
FROM OrdersEntity C
INNER JOIN OrdersEntity P
ON C.OrderId = P.orderId
WHERE P.isDeleted = false
AND P.isActive = true
AND C.isDeleted = false
AND C.isActive = true
GROUP BY
C.description8/*