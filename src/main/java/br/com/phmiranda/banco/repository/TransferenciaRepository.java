/*
 * Author: phmiranda
 * Project: banco
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 06/04/2022
 */

package br.com.phmiranda.banco.repository;

import br.com.phmiranda.banco.domain.entity.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
}
