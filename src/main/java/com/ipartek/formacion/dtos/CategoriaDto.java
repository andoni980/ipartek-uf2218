package com.ipartek.formacion.dtos;

import java.util.List;

public record CategoriaDto(Long id, String nombre, String descripcion, List<ProductoDto> productos) {

}
