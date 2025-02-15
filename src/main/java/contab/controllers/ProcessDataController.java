package contab.controllers;

import contab.dto.ProcessMonthlyRecord;
import contab.services.IProcessService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/process")
public class ProcessDataController {

    private final IProcessService processService;

    public ProcessDataController(IProcessService processService) {
        this.processService = processService;
    }

    @GetMapping("/get-monthly-by-selected-date")
    public ResponseEntity<List<ProcessMonthlyRecord>> getMonthlyBySelectedDate() {
        return null;
    }
}
