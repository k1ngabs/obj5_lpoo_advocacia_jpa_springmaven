package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Advogado {
    @Id
    private Long oabAdvogado;
    private String nomeAdvogado;
    private Endereco enderecoAdvogado;
    private String telefoneAdvogado;
    private String emailAdvogado;
    @ManyToMany
    private List<Processo> processosEnvolvidos;

    public Advogado(Long oabAdvogado, String nomeAdvogado, Endereco enderecoAdvogado, String telefoneAdvogado, String emailAdvogado) {
        this.oabAdvogado = oabAdvogado;
        this.nomeAdvogado = nomeAdvogado;
        this.enderecoAdvogado = enderecoAdvogado;
        this.telefoneAdvogado = telefoneAdvogado;
        this.emailAdvogado = emailAdvogado;
    }

    public Advogado() {

    }

    public Long getOabAdvogado() {
        return oabAdvogado;
    }

    public String getNomeAdvogado() {
        return nomeAdvogado;
    }

    public String getTelefoneAdvogado() {
        return telefoneAdvogado;
    }
    public String getEmailAdvogado() {
        return emailAdvogado;
    }

    public void setOabAdvogado(Long oabAdvogado) {
        this.oabAdvogado = oabAdvogado;
    }

    public void setNomeAdvogado(String nomeAdvogado) {
        this.nomeAdvogado = nomeAdvogado;
    }

    public void setEnderecoAdvogado(Endereco enderecoAdvogado) {
        this.enderecoAdvogado = enderecoAdvogado;
    }

    public void setTelefoneAdvogado(String telefoneAdvogado) {
        this.telefoneAdvogado = telefoneAdvogado;
    }
    public void setEmailAdvogado(String emailAdvogado) {
        this.emailAdvogado = emailAdvogado;
    }

    public int registrarAdvogado(){

        return 0;
    }
    public String consultaAdvogado(){
        return "empty";
    }
    public String listarAdvogado(){
        return "empty";
    }
    @Override
    public String toString() {
        return "Advogado{" +
                "oabAdvogado=" + oabAdvogado +
                ", nomeAdvogado='" + nomeAdvogado + '\'' +
                ", enderecoAdvogado='" + enderecoAdvogado + '\'' +
                ", telefoneAdvogado='" + telefoneAdvogado + '\'' +
                ", emailAdvogado='" + emailAdvogado + '\'' +
                '}';
    }
}
