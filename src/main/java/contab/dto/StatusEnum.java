package contab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

    @AllArgsConstructor
    @Getter
    public enum StatusEnum {
        WAY,
        PENDING,
        IN_PROCESS,
        FINISHED,
        CANCELLED;
    }
