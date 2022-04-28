/*
 * Author: phmiranda
 * Project: banco
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 03/04/2022
 */

package br.com.phmiranda.banco.domain.entity;

import br.com.phmiranda.banco.domain.enums.Contrato;
import br.com.phmiranda.banco.domain.enums.Situacao;

import javax.persistence.*;

@Entity
@Table(name = "contas_bancarias")
public class ContaBancaria {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_agencia", nullable = false, length = 100)
    private Integer numeroAgencia;

    @Column(name = "numero_conta_corrente", nullable = false, length = 100)
    private Integer numeroContaCorrente;

    @Enumerated(EnumType.STRING)
    @Column(name = "contrato", nullable = false, length = 100)
    private Contrato contrato = Contrato.SEM_VINCULO;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao", nullable = false, length = 100)
    private Situacao situacao = Situacao.INATIVO;
}
