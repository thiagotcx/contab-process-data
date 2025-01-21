package contab.services.impl;

import contab.services.IProcessService;
import org.springframework.stereotype.Service;

// Inversão de dependencia
// Segregação por Interface

@Service
public class ProcessService implements IProcessService {
    @Override
    public String process() {
        return "processing...";
    }

    @Override
    public String process(String data) {
        return data + " processing";
    }
}
