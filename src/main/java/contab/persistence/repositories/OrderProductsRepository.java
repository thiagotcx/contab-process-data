package contab.persistence.repositories;

import contab.persistence.entities.OrderProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductsRepository extends JpaRepository<OrderProductsEntity, Long> {
}
