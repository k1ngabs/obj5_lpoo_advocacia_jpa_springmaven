package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "advogados")
@AllArgsConstructor
@NoArgsConstructor
public class Advogado {
    @Id
    private Long oabAdvogado;
    private String nomeAdvogado;
    private String enderecoAdvogado;
    private String telefoneAdvogado;
    private String emailAdvogado;

    @Override
    public String toString() {
        return "Advogado{" +
                "oabAdvogado=" + oabAdvogado +
                ", nomeAdvogado='" + nomeAdvogado + '\'' +
                ", enderecoAdvogado='" + enderecoAdvogado + '\'' +
                ", telefoneAdvogado='" + telefoneAdvogado + '\'' +
                ", emailAdvogado='" + emailAdvogado + '\'' +
                '}';
    }
}
