package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.Processo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pessoa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoa;
    private String nomePessoa;
    private String enderecoPessoa;
    private String telefonePessoa;
    private String emailPessoa;
    @OneToMany(mappedBy = "requerente")
    private List<Processo> processosCompoe;
    @OneToMany(mappedBy = "requerido")
    private List<Processo> processosParticipa;

    public Pessoa(String nomePessoa, String enderecoPessoa, String telefonePessoa, String emailPessoa) {
        this.nomePessoa = nomePessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public List<Processo> getProcessosCompoe() {
        return processosCompoe;
    }

    public void setProcessosCompoe(List<Processo> processosCompoe) {
        this.processosCompoe = processosCompoe;
    }

    public List<Processo> getProcessosParticipa() {
        return processosParticipa;
    }

    public void setProcessosParticipa(List<Processo> processosParticipa) {
        this.processosParticipa = processosParticipa;
    }

    public String listarPessoa(){
        return "empty";
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", enderecoPessoa='" + enderecoPessoa + '\'' +
                ", telefonePessoa='" + telefonePessoa + '\'' +
                ", emailPessoa='" + emailPessoa + '\'' +
                '}';
    }

}
