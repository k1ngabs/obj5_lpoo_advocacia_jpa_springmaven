package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "processos")
public class Processo {
    @Id
    private long numeroProcesso;
    private Date aberturaProcesso;
    @Column(nullable = true)
    private Date conclusaoProcesso;
    private String descricaoProcesso;

    //Mapeamento de Classe Enum:
    @Enumerated(EnumType.STRING)
    private Situacao situacaoProcesso;

    //Mapeamento Many to Many:
    @ManyToMany
    @JoinTable(
            name = "assume",
            joinColumns = @JoinColumn(name = "id_processos"),
            inverseJoinColumns = @JoinColumn(name = "id_advogados")

    )
    private List<Advogado> advogados;

    //Mapeamentos Many to One:
    @ManyToOne
    @JoinColumn(referencedColumnName = "idPessoa")
    private Pessoa requerente;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idPessoa")
    private Pessoa requerido;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idVara")
    private Vara vara;

    //Mapeamentos One to Many:
    @OneToMany(mappedBy = "processo")
    @Column(nullable = false)
    private List<Audiencia> audiencias;
    @OneToMany(mappedBy = "processo")
    @Column(nullable = true)
    private List<Custa> custos;

}
