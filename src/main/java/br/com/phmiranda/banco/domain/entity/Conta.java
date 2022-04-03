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

public class Conta {
    private Long id;
    private Integer numeroAgencia;
    private Integer numeroConta;
    private Contrato contrato = Contrato.SEM_VINCULO;
    private Situacao situacao = Situacao.SEM_STATUS;
}
