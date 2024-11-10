package br.com.fiap.ecometric.monitoramento;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MonitoramentoService {

    @Autowired
    MonitoramentoRepository repository;

    public List<Monitoramento> findAll(){
        return repository.findAll();
    }

    public Monitoramento create(Monitoramento monitoramento) {
        return repository.save(monitoramento);
    }
}
