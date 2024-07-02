package org.codigo.msroquesucarihexagonal.application.controller;

import lombok.RequiredArgsConstructor;
import org.codigo.msroquesucarihexagonal.domain.aggregates.dto.EmpleadoDTO;
import org.codigo.msroquesucarihexagonal.domain.aggregates.request.RequestEmpleado;
import org.codigo.msroquesucarihexagonal.domain.ports.in.EmpleadoServiceIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/persona")
@RequiredArgsConstructor
public class EmpleadoController {

    private final EmpleadoServiceIn empleadoServiceIn;

    @PostMapping
    public ResponseEntity<EmpleadoDTO> registrar(@RequestBody RequestEmpleado persona) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(empleadoServiceIn.crearPersonaIn(persona));
    }
}
