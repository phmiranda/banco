/*
 * Author: phmiranda
 * Project: banco
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 03/04/2022
 */

package br.com.phmiranda.banco.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "instituicoes_bancarias")
public class InstituicaoBancaria {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero", nullable = false, length = 100)
    private Integer numero;

    @Column(name = "razao_social", nullable = false, length = 100)
    private String razaoSocial;

    @Column(name = "nome_fantasia", nullable = false, length = 100)
    private String nomeFantasia;
}
