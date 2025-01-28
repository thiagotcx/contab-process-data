package contab.services.impl;

import contab.services.*;
import org.springframework.stereotype.Service;

// Inversão de dependencia
// Segregação por Interface

@Service
public class ProcessService implements IProcessService {

    private final IProcessClientService processClientService;
    private final IMessageService messageService;

    public ProcessService(
            IProcessClientService processClientService,
            IMessageService messageService
    ) {
        this.processClientService = processClientService;
        this.messageService = messageService;
    }

    @Override
    public String process() {
        return messageService.sendMessage(
                processClientService.isProcessEnabled()
        );
    }

    @Override
    public String process(String data) {
        if (data == null) {
            return "ERRO";
        }

        return data + messageService.sendMessage(
                processClientService.isProcessEnabled()
        );
    }
}
