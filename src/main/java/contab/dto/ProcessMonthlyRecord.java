package contab.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProcessMonthlyRecord(
        LocalDate processDate,
        LocalDateTime initProcessDateTime,
        LocalDateTime finishProcessDateTime
) { }
