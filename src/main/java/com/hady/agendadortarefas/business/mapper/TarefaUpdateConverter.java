package com.hady.agendadortarefas.business.mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.hady.agendadortarefas.business.dto.TarefasDTO;
import com.hady.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel =  "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface TarefaUpdateConverter {
    void updateTarefas(TarefasDTO dto, @MappingTarget  TarefasEntity entity);
}
