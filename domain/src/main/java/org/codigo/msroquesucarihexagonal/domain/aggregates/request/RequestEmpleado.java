package org.codigo.msroquesucarihexagonal.domain.aggregates.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestEmpleado {
    private String numDocu;
    private String cargo="Developer";
    private String correo="test@gmail.com";
}
