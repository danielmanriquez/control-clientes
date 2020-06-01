package com.cclientes.datos;


import com.cclientes.dominio.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Integer>{
    
}
