package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPessoa;
    private String nomePessoa;
    private String enderecoPessoa;
    private String telefonePessoa;
    private String emailPessoa;
    @OneToMany(mappedBy = "requerente")
    private List<Processo> processosCompoe;
    @OneToMany(mappedBy = "requerido")
    private List<Processo> processosParticipa;

    public Pessoa() {
    }

    public Pessoa(String nomePessoa, String enderecoPessoa, String telefonePessoa, String emailPessoa) {
        this.nomePessoa = nomePessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.telefonePessoa = telefonePessoa;
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
