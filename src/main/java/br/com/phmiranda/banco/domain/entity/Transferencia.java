/*
 * Author: phmiranda
 * Project: banco
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 03/04/2022
 */

package br.com.phmiranda.banco.domain.entity;

import br.com.phmiranda.banco.domain.enums.Operacao;

import javax.persistence.*;

@Entity
@Table(name = "transferencias")
public class Transferencia {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao", nullable = false, columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "valor", nullable = false, length = 50)
    private Double valorOperacao;

    @Column(name = "operacao", nullable = false, length = 50)
    private Operacao operacao;

    @OneToOne
    @JoinColumn(name = "instituicao_bancaria_id", nullable = true)
    private InstituicaoBancaria instituicaoBancaria;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = true)
    private Usuario usuario;
}
