package com.totalshakes.wstotalshakes.service.interfaces;

import com.totalshakes.wstotalshakes.model.Adicional;

public interface IAdicionalService {
    Adicional salvarAdicional (Adicional adicional);
    void editarAdicional (Adicional adicional);
    Adicional buscarAdicional (Integer id);
    void excluirAdicional (Integer id);
}
