package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa_fisica;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaFisicaService {

    @Autowired
    private PessoaFisicaRepository rep;


    //Reads
    public List<PessoaFisica> getPessoasFisicas(){return rep.findAll();}
    public PessoaFisica getPessoaFisicaById(long id){
        Optional<PessoaFisica> optional = rep.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }
    public Pessoa getPessoaByName(String nome){
        Optional<Pessoa> opt = rep.findByNome(nome);
        if(opt.isPresent()){
            return opt.get();
        }
        return null;
    }
    public PessoaFisica getPessoaFisicaByCpf(String cpf){
        Optional<PessoaFisica> opt = rep.findByCPF(cpf);
        if (opt.isPresent()) return opt.get();
        return null;}
    public PessoaFisica getPessoaFisicaByRg(String rg){
        return (PessoaFisica) rep.findByRG(rg);
    }

    public Pessoa getPessoaByEmail(String email){
        return (Pessoa) rep.findByEmail(email);
    }

    //Create
    public PessoaFisica create(PessoaFisica pf){
        Assert.isNull(pf.getIdPessoa(),"Erro ao criar pessoa");
        return (PessoaFisica) rep.save(pf);
    }
    //Update
    public PessoaFisica update(PessoaFisica pf){
        Assert.notNull(pf.getIdPessoa(),"Erro ao atualizar pessoa");

        Optional<PessoaFisica> optional = rep.findById(pf.getIdPessoa());
        if(optional.isPresent()){
            PessoaFisica bd = optional.get();
            bd.setNomePessoa(pf.getNomePessoa());
            bd.setCpfPessoa(pf.getCpfPessoa());
            bd.setRgPessoa(pf.getRgPessoa());
            bd.setEnderecoPessoa(pf.getEnderecoPessoa());
            bd.setEmailPessoa(pf.getEmailPessoa());
            bd.setTelefonePessoa(pf.getTelefonePessoa());
            rep.save(bd);
            return bd;
        } else {
            return null;
        }
    }
    //Delete
    public void delete(Long id){rep.deleteById(id);}
}


    //    public PessoaFisica updateProcessos(PessoaFisica pf){
//        Assert.notNull(pf.getIdPessoa(),"Erro ao atualizar processos");
//
//        Optional<PessoaFisica> opt = rep.findById(pf.getIdPessoa());
//        if (opt.isPresent()){
//            PessoaFisica bd = opt.get();
//            bd.setProcessosCompoe(pf.getProcessosCompoe());
//            bd.setProcessosParticipa(pf.getProcessosParticipa());
//            return bd;
//        } else {
//            return null;
//        }
//    }


