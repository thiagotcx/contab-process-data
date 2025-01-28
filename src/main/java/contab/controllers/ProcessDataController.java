package contab.controllers;

import contab.services.IProcessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessDataController {

    // Inversão de dependencia
    // Segregação por Interface

    private final IProcessService processService;

    public ProcessDataController(IProcessService processService) {
        this.processService = processService;

    }

    @GetMapping("/data")
    public String processData() {

        var response = processService.process();

        var responseData = processService.process("input");

        return response + " - " + responseData;
    }
}
