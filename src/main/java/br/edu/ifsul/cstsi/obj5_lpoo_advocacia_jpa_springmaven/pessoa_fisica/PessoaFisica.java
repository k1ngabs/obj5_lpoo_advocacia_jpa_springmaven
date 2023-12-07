package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa_fisica;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@EqualsAndHashCode(callSuper = true)
@Entity
@PrimaryKeyJoinColumn(name = "pessoa_fisica")
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PessoaFisica extends Pessoa {
    private String cpfPessoa;
    private String rgPessoa;

    public PessoaFisica(String nomePessoa, String enderecoPessoa, String telefonePessoa, String emailPessoa, String cpfPessoa, String rgPessoa) {
        super(nomePessoa, enderecoPessoa, telefonePessoa, emailPessoa);
        this.cpfPessoa = cpfPessoa;
        this.rgPessoa = rgPessoa;
    }

    public int registrarPessoal(){
        return 0;
    }
    public String consultarPessoa(){
        return "fulano";
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public void setRgPessoa(String rgPessoa) {
        this.rgPessoa = rgPessoa;
    }

    @Override
    public String toString() {
        return "\nPessoaFisica{" +
                "Nome: " + getNomePessoa() + '\'' +
                ", Email: " + getEmailPessoa() + '\'' +
                ", Endereco: " + getEnderecoPessoa() + '\'' +
                ", Telefone: " + getTelefonePessoa() + '\'' +
                ", cpfPessoa='" + cpfPessoa + '\'' +
                ", rgPessoa='" + rgPessoa + '\'' +
                '}';
    }
}
