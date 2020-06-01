/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cclientes.datos;

import com.cclientes.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository<Usuario , Integer> {
    
    
    public Usuario findByUsername(String username);
    
    
    
}
