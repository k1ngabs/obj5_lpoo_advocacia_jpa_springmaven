package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.assume;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado.Advogado;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.Processo;
import jakarta.persistence.*;

import java.time.LocalDate;

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
