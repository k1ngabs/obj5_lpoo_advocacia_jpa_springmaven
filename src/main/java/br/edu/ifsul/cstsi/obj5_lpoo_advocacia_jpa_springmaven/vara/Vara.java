package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.vara;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.tribunal.Tribunal;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.Processo;
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

    @OneToMany(mappedBy = "vara")
    private List<Processo> processo;

}
