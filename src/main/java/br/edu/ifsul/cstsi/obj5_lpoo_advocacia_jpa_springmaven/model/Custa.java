package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "custos")
public class Custa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCusta;
    private Date dataCusta;
    private String descricaoCusta;
    private double valorCusta;

    @ManyToOne
    @JoinColumn(referencedColumnName = "numeroProcesso")
    private Processo processo;
}
