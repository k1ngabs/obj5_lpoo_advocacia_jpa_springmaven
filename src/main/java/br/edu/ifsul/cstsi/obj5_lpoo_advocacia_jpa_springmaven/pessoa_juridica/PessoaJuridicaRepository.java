package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa_juridica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica,Long> {
    @Query(value = "select p from PessoaJuridica p WHERE p.cnpjPessoa = ?1")
    List<PessoaJuridica> findByCNPJ(String cnpjPessoa);

}
