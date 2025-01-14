package contab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessDataController {

    @GetMapping("/data")
    public String processData() {
        return "Processing data...";
    }
}
