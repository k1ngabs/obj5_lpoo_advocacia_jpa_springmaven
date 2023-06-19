package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado.Advogado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaRepository extends JpaRepository {

    @Query(value = "SELECT a from Pessoa a WHERE a.nomePessoa = ?1")
    List<Pessoa> findPessoaByName(String name);
    @Query(value = "SELECT a FROM Pessoa a WHERE a.emailPessoa = ?1")
    List<Pessoa> findPessoaByEmail(String email);
    @Query(value = "SELECT a FROM Pessoa a WHERE a.telefonePessoa = ?1")
    List<Advogado> findPessoaByTelefone(String tel);
}
