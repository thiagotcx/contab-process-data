package contab.persistence.repositories;

import contab.persistence.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query(value = "SELECT * FROM tb_products p where is_deleted = false and is_active = true",
            nativeQuery = true)
    List<ProductEntity> getActiveProducts();

    @NativeQuery(value = "SELECT * FROM tb_products p where is_deleted = false and is_active = true")
    List<ProductEntity> getActives();

    List<ProductEntity> findByIsDeletedFalseAndIsActiveTrue();

    @Query(value = "SELECT P FROM ProductEntity P WHERE P.isDeleted = false AND P.isActive = true")
    List<ProductEntity> getActivesWithJPQL();

}
