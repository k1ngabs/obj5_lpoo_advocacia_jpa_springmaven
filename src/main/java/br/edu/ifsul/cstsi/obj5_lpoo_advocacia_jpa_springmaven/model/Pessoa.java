package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public abstract class Pessoa {
    @Id
    private long idPessoa;
    private String nomePessoa;
    private Endereco enderecoPessoa;
    private String telefonePessoa;
    private String emailPessoa;
    @OneToMany(mappedBy = "requerente")
    private List<Processo> processosCompoe;
    @OneToMany(mappedBy = "requerido")
    private List<Processo> processosParticipa;

    public Pessoa() {
    }

    public Pessoa(String nomePessoa, Endereco enderecoPessoa, String telefonePessoa, String emailPessoa) {
        this.nomePessoa = nomePessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Endereco getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(Endereco enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }


    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String listarPessoa(){
        return "empty";
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", enderecoPessoa='" + enderecoPessoa + '\'' +
                ", telefonePessoa='" + telefonePessoa + '\'' +
                ", emailPessoa='" + emailPessoa + '\'' +
                '}';
    }
}
