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
    private LocalDate processDate;

    @Setter
    @Column(name = "is_processed")
    private boolean isProcessed;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Setter
    @Column(name = "init_process_at")
    private LocalDateTime initProcessAt;

    @Setter
    @Column(name = "finish_process_at")
    private LocalDateTime finishProcessAt;

    @Setter
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
