package contab.persistence.repositories;

import contab.dto.ProductDTO;
import contab.persistence.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query(value = """
        SELECT
            new contab.dto.ProductDTO(
                C.description,
                P.description,
                P.price
            )
        FROM ProductEntity P
            INNER JOIN CategoryEntity C
                ON P.categoryId = C.categoryId
        WHERE P.isDeleted = false
            AND P.isActive = true
            AND C.isDeleted = false
            AND C.isActive = true
    """)
    List<ProductDTO> getActiveProducts();
}
