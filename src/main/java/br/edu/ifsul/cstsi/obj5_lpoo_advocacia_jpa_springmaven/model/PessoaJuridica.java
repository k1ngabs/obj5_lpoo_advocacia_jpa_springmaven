package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PessoaJuridica extends Pessoa {
    @Id
    private long cnpjPessoa;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nomePessoa, Endereco enderecoPessoa, String telefonePessoa, String emailPessoa) {
        super(nomePessoa, enderecoPessoa, telefonePessoa, emailPessoa);
    }

    public PessoaJuridica(long cnpjPessoa) {
        this.cnpjPessoa = cnpjPessoa;
    }

    public PessoaJuridica(String nomePessoa, Endereco enderecoPessoa, String telefonePessoa, String emailPessoa, long cnpjPessoa) {
        super(nomePessoa, enderecoPessoa, telefonePessoa, emailPessoa);
        this.cnpjPessoa = cnpjPessoa;
    }

    public int registrarPessoal(){
        return 0;
    }
    public String consultarPessoa(){
        return "fulano";
    }
}
