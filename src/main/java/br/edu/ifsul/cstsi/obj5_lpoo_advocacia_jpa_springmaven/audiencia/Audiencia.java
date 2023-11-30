package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.audiencia;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.Processo;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "audiencias")
public class Audiencia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAudiencia;
    private Date dataAudiencia;
    private String parecerAudiencia;

    @ManyToOne
    @JoinColumn(referencedColumnName = "numeroProcesso")
    private Processo processo;

}
