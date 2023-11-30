package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdvogadoService {
    @Autowired
    private AdvogadoRepository repository;

    public List<Advogado> getAdvogados(){
        return repository.findAll();
    }

    public Advogado getClienteById(Long id){
        Optional<Advogado> optional = repository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public List<Advogado> getAdvogadoByNome(String nome) {
        return new ArrayList<>(repository.findByNome(nome + "%"));
    }
}
