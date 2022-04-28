/*
 * Author: phmiranda
 * Project: banco
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 06/04/2022
 */

package br.com.phmiranda.banco.service;

import br.com.phmiranda.banco.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaService {

    @Autowired
    TransferenciaRepository transferenciaRepository;
}
