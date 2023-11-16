package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;


import jakarta.persistence.*;
import jdk.jfr.Name;

import java.util.List;

@Entity
@Table(name = "advogados")
public class Advogado {
    @Id
    private Long oabAdvogado;
    private String nomeAdvogado;
    private String enderecoAdvogado;
    private String telefoneAdvogado;
    private String emailAdvogado;
    @ManyToMany(mappedBy = "advogados")
    private List<Processo> processos;

    public Advogado(Long oabAdvogado, String nomeAdvogado, String enderecoAdvogado, String telefoneAdvogado, String emailAdvogado) {
        this.oabAdvogado = oabAdvogado;
        this.nomeAdvogado = nomeAdvogado;
        this.enderecoAdvogado = enderecoAdvogado;
        this.telefoneAdvogado = telefoneAdvogado;
        this.emailAdvogado = emailAdvogado;
    }

    public Advogado() {

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
