package br.com.fiap.ecometric.monitoramento;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/monitoramento")
public class MonitoramentoController {

    @Autowired
    MonitoramentoService service;
    
    @GetMapping
    public List<Monitoramento> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Monitoramento create(@RequestBody MonitoramentoRequest monitoramento){
        return service.create(monitoramento.toModel());
    }
}
