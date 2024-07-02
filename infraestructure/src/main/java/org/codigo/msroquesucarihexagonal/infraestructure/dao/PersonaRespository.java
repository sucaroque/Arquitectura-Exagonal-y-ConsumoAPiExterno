package org.codigo.msroquesucarihexagonal.infraestructure.dao;

import org.codigo.msroquesucarihexagonal.infraestructure.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRespository extends JpaRepository<EmpleadoEntity,Long> {


}
