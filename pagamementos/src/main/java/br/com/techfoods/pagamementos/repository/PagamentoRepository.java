package br.com.techfoods.pagamementos.repository;

import br.com.techfoods.pagamementos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
