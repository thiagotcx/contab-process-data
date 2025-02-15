package contab.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProcessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "process_id")
    private Long processId;

    @Column(name = "process_date")
    private LocalDate processDate; // 2025-01-14

    @Setter
    @Column(name = "is_processed")
    private boolean isProcessed; // false

    @Column(name = "created_at")
    private LocalDateTime createdAt; //2025-02-13 23:46:52

    @Setter
    @Column(name = "init_process_at")
    private LocalDateTime initProcessAt; // 2025-02-14 10:00:00

    @Setter
    @Column(name = "finish_process_at")
    private LocalDateTime finishProcessAt; // 2025-02-14 10:30:14

    @Setter
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
