package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.endereco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Endereco {
    private long idEndereco;
    private String bairro;
    private String cidade;
    private long cep;
    private String uf;
    private String numero;
    private String complemento;
}
