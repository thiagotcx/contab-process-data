package contab.persistence.repositories;

import contab.dto.CategoryDTO;
import contab.dto.OrderProductsDTO;
import contab.persistence.entities.OrderProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderProductsRepository extends JpaRepository<OrderProductsEntity, Long> {

    @Query("""
        SELECT new contab.dto.OrderProductsDTO(
            P.description,
            P.barcode,
            OP.amount,
            OP.price,
            OP.amount * OP.price
        )
        FROM OrderProductsEntity OP
        JOIN OP.product P
        WHERE OP.isDeleted = false
        AND P.isDeleted = false
    """)

    List<OrderProductsDTO> getOrderProductDetails();
}

