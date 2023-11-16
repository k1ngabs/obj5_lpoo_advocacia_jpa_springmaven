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

}
