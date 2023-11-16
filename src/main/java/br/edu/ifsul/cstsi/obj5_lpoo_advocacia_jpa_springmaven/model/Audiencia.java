package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Audiencia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAudiencia;
    private Date dataAudiencia;
    private String parecerAudiencia;

    @ManyToOne
    @JoinColumn(referencedColumnName = "numeroProcesso")
    private Processo processo;

}
