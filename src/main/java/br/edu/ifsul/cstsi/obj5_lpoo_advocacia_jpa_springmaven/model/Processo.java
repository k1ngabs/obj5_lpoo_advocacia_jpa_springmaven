package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Processo {
    @Id
    private long numeroProcesso;
    private Date aberturaProcesso;
    @Column(nullable = true)
    private Date conclusaoProcesso;
    private String descricaoProcesso;
    private Situacao situacaoProcesso;
    @ManyToMany
    private List<Advogado> advogados;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idPessoa")
    private Pessoa requerente;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idPessoa")
    private Pessoa requerido;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idVara")
    private Vara vara;
    @OneToMany(mappedBy = "processo")
    @Column(nullable = false)
    private List<Audiencia> audiencias;
    @OneToMany(mappedBy = "processo")
    @Column(nullable = true)
    private List<Custa> custos;

}
