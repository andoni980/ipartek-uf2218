package com.ipartek.formacion.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProductoDto(Long id, String nombre, String descripcion, BigDecimal precio, LocalDate fechaCaducidad, Long idCategoria) {

}
