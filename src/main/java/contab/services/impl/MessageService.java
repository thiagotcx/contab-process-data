package contab.services.impl;

import contab.services.IMessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessageService {

    @Override
    public String sendMessage(boolean isProcessEnabled) {
        return isProcessEnabled ? "Process enabled" : "Process disabled";
    }
}
