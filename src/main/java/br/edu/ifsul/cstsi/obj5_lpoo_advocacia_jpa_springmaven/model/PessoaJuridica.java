package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "pessoa_juridica")
public class PessoaJuridica extends Pessoa {
    private long cnpjPessoa;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nomePessoa, String enderecoPessoa, String telefonePessoa, String emailPessoa) {
        super(nomePessoa, enderecoPessoa, telefonePessoa, emailPessoa);
    }

    public PessoaJuridica(long cnpjPessoa) {
        this.cnpjPessoa = cnpjPessoa;
    }

    public PessoaJuridica(String nomePessoa, String enderecoPessoa, String telefonePessoa, String emailPessoa, long cnpjPessoa) {
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
