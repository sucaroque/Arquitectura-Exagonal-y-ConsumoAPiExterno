package org.codigo.msroquesucarihexagonal.infraestructure.mapper;

import org.codigo.msroquesucarihexagonal.domain.aggregates.dto.EmpleadoDTO;
import org.codigo.msroquesucarihexagonal.infraestructure.entity.EmpleadoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public EmpleadoDTO mapToDTO(EmpleadoEntity empleadoEntity){
        return modelMapper.map(empleadoEntity, EmpleadoDTO.class);
    }

    public EmpleadoEntity mapToEntity(EmpleadoDTO empleadoDTO){
        return modelMapper.map(empleadoDTO, EmpleadoEntity.class);
    }
}
