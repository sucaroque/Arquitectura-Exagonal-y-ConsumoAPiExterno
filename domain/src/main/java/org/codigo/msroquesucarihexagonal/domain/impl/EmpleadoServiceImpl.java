package org.codigo.msroquesucarihexagonal.domain.impl;

import lombok.RequiredArgsConstructor;
import org.codigo.msroquesucarihexagonal.domain.aggregates.dto.EmpleadoDTO;
import org.codigo.msroquesucarihexagonal.domain.aggregates.request.RequestEmpleado;
import org.codigo.msroquesucarihexagonal.domain.ports.in.EmpleadoServiceIn;
import org.codigo.msroquesucarihexagonal.domain.ports.out.EmpleadoServiceOut;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoServiceIn {

    private final EmpleadoServiceOut empleadoServiceOut;

    @Override
    public EmpleadoDTO crearPersonaIn(RequestEmpleado persona) {
        return empleadoServiceOut.crearPersonaOut(persona);
    }
}
