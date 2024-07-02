package org.codigo.msroquesucarihexagonal.domain.ports.out;

import org.codigo.msroquesucarihexagonal.domain.aggregates.dto.EmpleadoDTO;
import org.codigo.msroquesucarihexagonal.domain.aggregates.request.RequestEmpleado;

public interface EmpleadoServiceOut {
    EmpleadoDTO crearPersonaOut(RequestEmpleado persona);
}
