package contab.persistence.repositories;

import contab.dto.CategoryDTO;
import contab.persistence.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    @Query(value = """
        SELECT
            new contab.dto.CategoryDTO(
                C.description,
                COUNT(P)
            )
        FROM CategoryEntity C
            INNER JOIN ProductEntity P
                ON C.categoryId = P.categoryId
        WHERE P.isDeleted = false
            AND P.isActive = true
            AND C.isDeleted = false
            AND C.isActive = true
        GROUP BY
            C.description
    """)
    List<CategoryDTO> getActiveCategories();
}
