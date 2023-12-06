package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.audiencia.Audiencia;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.custa.Custa;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.situacao.Situacao;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.vara.Vara;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa.Pessoa;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "processos")
public class Processo {
    @Id
    private Long numeroProcesso;
    private Date aberturaProcesso;
    @Column(nullable = true)
    private Date conclusaoProcesso;
    private String descricaoProcesso;

    //Mapeamento de Classe Enum:
    @Enumerated(EnumType.STRING)
    private Situacao situacaoProcesso;

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
