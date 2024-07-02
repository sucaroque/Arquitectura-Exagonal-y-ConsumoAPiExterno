package org.codigo.msroquesucarihexagonal.infraestructure.adapters;

import lombok.RequiredArgsConstructor;
import org.codigo.msroquesucarihexagonal.domain.aggregates.constants.Constants;
import org.codigo.msroquesucarihexagonal.domain.aggregates.dto.EmpleadoDTO;
import org.codigo.msroquesucarihexagonal.domain.aggregates.request.RequestEmpleado;
import org.codigo.msroquesucarihexagonal.domain.aggregates.response.ResponseReniec;
import org.codigo.msroquesucarihexagonal.domain.ports.out.EmpleadoServiceOut;
import org.codigo.msroquesucarihexagonal.infraestructure.dao.PersonaRespository;
import org.codigo.msroquesucarihexagonal.infraestructure.entity.EmpleadoEntity;
import org.codigo.msroquesucarihexagonal.infraestructure.mapper.EmpleadoMapper;
import org.codigo.msroquesucarihexagonal.infraestructure.rest.ClienteReniec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.*;


@Service
@RequiredArgsConstructor
public class EmpleadoAdapter implements EmpleadoServiceOut {

    private final PersonaRespository personaRespository;
    private final ClienteReniec reniec;
    private final EmpleadoMapper empleadoMapper;

    @Value("${token}")
    private String token;


    @Override
    public EmpleadoDTO crearPersonaOut(RequestEmpleado persona) {
        EmpleadoEntity empleadoEntity = getPersonaEntity(persona);
        personaRespository.save(empleadoEntity);
        return empleadoMapper.mapToDTO(personaRespository.save(empleadoEntity));
    }

    private EmpleadoEntity getPersonaEntity(RequestEmpleado requestEmpleado) {
        ResponseReniec responseReniec = getExec(requestEmpleado.getNumDocu());
        EmpleadoEntity empleadoEntity = new EmpleadoEntity();
        empleadoEntity.setNumDoc(responseReniec.getNumeroDocumento());
        empleadoEntity.setNombre(responseReniec.getNombres());
        empleadoEntity.setApePat(responseReniec.getApellidoPaterno());
        empleadoEntity.setApeMat(responseReniec.getApellidoMaterno());
        empleadoEntity.setEstado(Constants.ESTADO_ACTIVO);
        empleadoEntity.setUsuaCrea(Constants.USUA_ADMIN);
        empleadoEntity.setDateCrea(getTime());
        empleadoEntity.setCargo(requestEmpleado.getCargo());
        empleadoEntity.setCorreo(requestEmpleado.getCorreo());
        return empleadoEntity;
    }

    private Timestamp getTime(){
        long current = System.currentTimeMillis();
        return new Timestamp(current);
    }

    private ResponseReniec getExec(String numero){
        String head = "Bearer "+token;
        ResponseReniec responseReniec = reniec.getInfoReniec(numero, head);
        return responseReniec;
    }
}
