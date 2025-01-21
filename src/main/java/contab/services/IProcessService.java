package contab.services;

// Inversão de dependencia
// Segregação por Interface

public interface IProcessService {
    String process();

    String process(String data);
}
