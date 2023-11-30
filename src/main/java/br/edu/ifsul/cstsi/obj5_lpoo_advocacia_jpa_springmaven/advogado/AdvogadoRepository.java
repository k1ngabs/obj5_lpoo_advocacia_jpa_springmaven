package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.situacao.Situacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AdvogadoRepository extends JpaRepository<Advogado,Long> {
    @Query(value = "SELECT a FROM Advogado a where a.nomeAdvogado like ?1")
    List<Advogado> findByNome(String nome);

}
