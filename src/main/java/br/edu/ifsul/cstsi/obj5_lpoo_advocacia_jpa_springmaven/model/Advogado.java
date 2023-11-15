package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Advogado {
    @Id
    private Long oabAdvogado;
    private String nomeAdvogado;
    private String enderecoAdvogado;
    private String telefoneAdvogado;
    private String bairroAdvogado;
    private String cepAdvogado;
    private String emailAdvogado;

    public Advogado(Long oabAdvogado, String nomeAdvogado, String enderecoAdvogado, String telefoneAdvogado, String bairroAdvogado, String cepAdvogado, String emailAdvogado) {
        this.oabAdvogado = oabAdvogado;
        this.nomeAdvogado = nomeAdvogado;
        this.enderecoAdvogado = enderecoAdvogado;
        this.telefoneAdvogado = telefoneAdvogado;
        this.bairroAdvogado = bairroAdvogado;
        this.cepAdvogado = cepAdvogado;
        this.emailAdvogado = emailAdvogado;
    }

    public Advogado() {

    }

    public Long getOabAdvogado() {
        return oabAdvogado;
    }

    public String getNomeAdvogado() {
        return nomeAdvogado;
    }

    public String getEnderecoAdvogado() {
        return enderecoAdvogado;
    }

    public String getTelefoneAdvogado() {
        return telefoneAdvogado;
    }

    public String getBairroAdvogado() {
        return bairroAdvogado;
    }

    public String getCepAdvogado() {
        return cepAdvogado;
    }

    public String getEmailAdvogado() {
        return emailAdvogado;
    }

    public void setOabAdvogado(Long oabAdvogado) {
        this.oabAdvogado = oabAdvogado;
    }

    public void setNomeAdvogado(String nomeAdvogado) {
        this.nomeAdvogado = nomeAdvogado;
    }

    public void setEnderecoAdvogado(String enderecoAdvogado) {
        this.enderecoAdvogado = enderecoAdvogado;
    }

    public void setTelefoneAdvogado(String telefoneAdvogado) {
        this.telefoneAdvogado = telefoneAdvogado;
    }

    public void setBairroAdvogado(String bairroAdvogado) {
        this.bairroAdvogado = bairroAdvogado;
    }

    public void setCepAdvogado(String cepAdvogado) {
        this.cepAdvogado = cepAdvogado;
    }

    public void setEmailAdvogado(String emailAdvogado) {
        this.emailAdvogado = emailAdvogado;
    }

    public int registrarAdvogado(){

        return 0;
    }
    public String consultaAdvogado(){
        return "empty";
    }
    public String listarAdvogado(){
        return "empty";
    }
    @Override
    public String toString() {
        return "Advogado{" +
                "oabAdvogado=" + oabAdvogado +
                ", nomeAdvogado='" + nomeAdvogado + '\'' +
                ", enderecoAdvogado='" + enderecoAdvogado + '\'' +
                ", telefoneAdvogado='" + telefoneAdvogado + '\'' +
                ", bairroAdvogado='" + bairroAdvogado + '\'' +
                ", cepAdvogado='" + cepAdvogado + '\'' +
                ", emailAdvogado='" + emailAdvogado + '\'' +
                '}';
    }
}
