package contab.persistence.repositories;

import contab.persistence.entities.ProcessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProcessRepository extends JpaRepository<ProcessEntity, Long> {

    Optional<ProcessEntity> findByProcessId(Long processId);

    List<ProcessEntity> findAllByDeletedAtIsNotNull();

    // Listar todos os processos between createdAt
    List<ProcessEntity> findByCreatedAtBetween(LocalDateTime start, LocalDateTime finish);

    // Listar todos os processos que foram processados
    List<ProcessEntity> findAllByProcessedIsTrue();
    List<ProcessEntity> findByProcessedIs(boolean isProcessed);

    // Listar todos os processos que iniciaram apos uma data e finalizaram antes de uma data
    List<ProcessEntity> findAllByInitProcessAtAfterAndFinishProcessAtBefore(LocalDateTime initProcessDate, LocalDateTime finishProcessDate);
}
