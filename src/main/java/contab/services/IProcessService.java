package contab.services;

// Inversão de dependencia
// Segregação por Interface

public interface IProcessService {
    String process();

    // OUTPUT      // INPUT
    String process(String data);
}
