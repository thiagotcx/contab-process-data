package contab.services.impl;

import contab.services.IProcessClientService;
import org.springframework.stereotype.Service;

@Service
public class ProcessClientService implements IProcessClientService {
    @Override
    public boolean isProcessEnabled() {
        return true;
    }
}
