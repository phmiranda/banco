/*
 * Author: phmiranda
 * Project: banco
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 03/04/2022
 */

package br.com.phmiranda.banco.domain.entity;

import br.com.phmiranda.banco.domain.enums.Operacao;

public class Transferencia {
    private Long id;
    private String descricao;
    private Double valorOperacao;
    private Operacao operacao;
    private Usuario usuario;
    private Banco banco;
}
