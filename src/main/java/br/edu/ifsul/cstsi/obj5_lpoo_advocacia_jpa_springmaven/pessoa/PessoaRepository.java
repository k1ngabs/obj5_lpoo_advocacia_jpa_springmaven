package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa;

import org.hibernate.collection.spi.PersistentSortedMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaRepository extends JpaRepository {
    @Query(value = "SELECT p FROM Pessoa p where p.nomePessoa = ?1")
    List<Pessoa> findByNome(String nome);
    @Query(value = "SELECT p from Pessoa p where p.emailPessoa = ?1")
    List<Pessoa> findByEmail(String email);
    @Query(value = "select p from Pessoa p where p.enderecoPessoa = ?1")
    List<Pessoa> findByEnd(String end);
    @Query(value = "select p from Pessoa p where p.telefonePessoa = ?1")
    List<Pessoa> findByTel(String tel);
}
