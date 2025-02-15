package contab.persistence.repositories;

import contab.persistence.entities.ProcessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProcessRepository extends JpaRepository<ProcessEntity, Long> {
    List<ProcessEntity> findByProcessDateBetweenOrderByProcessDateAscInitProcessAtAscFinishProcessAtAsc(
            LocalDate init,
            LocalDate finish
    );
}
