package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "assume")
public class Assume {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate dataInicio;
    LocalDate dataFinal;
    @OneToOne
    Advogado advogado;
    @OneToOne
    Processo processo;
}
