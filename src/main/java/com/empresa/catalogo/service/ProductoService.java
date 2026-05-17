package com.empresa.catalogo.service;

import java.util.List;

import com.empresa.catalogo.dto.ProductoRequestDTO;
import com.empresa.catalogo.dto.ProductoResponseDTO;

public interface ProductoService {
    ProductoResponseDTO crear(ProductoRequestDTO dto);
    ProductoResponseDTO buscarPorId(Long id);
    List<ProductoResponseDTO> listarActivos();
    void eliminar(Long id);
}
