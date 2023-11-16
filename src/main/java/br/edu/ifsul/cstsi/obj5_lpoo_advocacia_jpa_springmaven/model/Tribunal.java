package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tribunal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTribunal;
    private Endereco enderecoTribunal;

    @OneToMany(mappedBy = "tribunal")
    @Column(nullable = false)
    private List<Vara> varas;
}

