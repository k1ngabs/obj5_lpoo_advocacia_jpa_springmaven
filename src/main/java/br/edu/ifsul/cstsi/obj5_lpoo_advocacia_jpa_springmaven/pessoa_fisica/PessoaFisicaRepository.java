package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa_fisica;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado.Advogado;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
    @Query(value = "SELECT p from PessoaFisica p WHERE p.cpfPessoa like ?1")
    List<PessoaFisica> findByCPF(String cpfPessoa);
    @Query(value = "SELECT p FROM PessoaFisica p WHERE p.rgPessoa like ?1")
    List<PessoaFisica> findByRG(String rgPessoa);
    @Query(value = "SELECT p FROM Pessoa p where p.nomePessoa = ?1")
    List<PessoaFisica> findByNome(String nome);
    @Query(value = "SELECT p from Pessoa p where p.emailPessoa = ?1")
    List<PessoaFisica> findByEmail(String email);
    @Query(value = "select p from Pessoa p where p.enderecoPessoa = ?1")
    List<PessoaFisica> findByEnd(String end);
    @Query(value = "select p from Pessoa p where p.telefonePessoa = ?1")
    List<PessoaFisica> findByTel(String tel);
}
