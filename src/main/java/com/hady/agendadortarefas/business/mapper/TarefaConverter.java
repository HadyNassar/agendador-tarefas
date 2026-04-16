package com.hady.agendadortarefas.business.mapper;

import com.hady.agendadortarefas.business.dto.TarefasDTO;
import com.hady.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

import javax.swing.*;

@Mapper(componentModel = "spring")
public interface UsuarioConverter {
    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

}
