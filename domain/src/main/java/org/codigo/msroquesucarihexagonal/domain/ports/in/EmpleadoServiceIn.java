package org.codigo.msroquesucarihexagonal.domain.ports.in;

import org.codigo.msroquesucarihexagonal.domain.aggregates.dto.EmpleadoDTO;
import org.codigo.msroquesucarihexagonal.domain.aggregates.request.RequestEmpleado;

public interface EmpleadoServiceIn {
    EmpleadoDTO crearPersonaIn(RequestEmpleado persona);
}
