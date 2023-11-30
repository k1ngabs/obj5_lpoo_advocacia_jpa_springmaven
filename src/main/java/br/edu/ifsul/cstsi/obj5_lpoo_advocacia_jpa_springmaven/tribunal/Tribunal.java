package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.tribunal;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.vara.Vara;
import jakarta.persistence.*;

import java.util.List;

    @Entity
    @Table(name = "tribunais")
    public class Tribunal {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idTribunal;
        private String enderecoTribunal;

        @OneToMany(mappedBy = "tribunal")
        @Column(nullable = false)
        private List<Vara> varas;
    }