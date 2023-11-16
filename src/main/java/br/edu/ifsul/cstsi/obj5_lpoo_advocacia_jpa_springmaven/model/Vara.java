package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Vara {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVara;
    private String descricaoVara;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idTribunal")
    private Tribunal tribunal;

    @OneToMany
    private List<Processo> processo;

}
