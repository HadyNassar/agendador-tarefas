package com.hady.agendadortarefas.business;

import com.hady.agendadortarefas.business.dto.TarefasDTO;
import com.hady.agendadortarefas.business.mapper.TarefaConverter;
import com.hady.agendadortarefas.infrastructure.entity.TarefasEntity;
import com.hady.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import com.hady.agendadortarefas.infrastructure.repository.TarefasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefasRepository tarefasRepository;
    private final TarefaConverter tarefaConverter;
    public TarefasDTO gravarTarefa(TarefasDTO dto){
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        TarefasEntity entity =  tarefaConverter.paraTarefaEntity(dto);

        return tarefaConverter.paraTarefaDTO
                (tarefasRepository.save(entity));
    }

}
