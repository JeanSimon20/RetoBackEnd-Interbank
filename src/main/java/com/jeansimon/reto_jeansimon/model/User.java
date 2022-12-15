package com.jeansimon.reto_jeansimon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "db_user")
public class User implements Serializable {

    @Id
    @NotNull(message = "El Codigo no puede estar Vacio")
    @Column(name = "codigoUnico")
    private long codigoUnico;

    @NotNull(message = "El Nombre no puede estar Vacio")
    @Column(name = "nombres")
    private String nombres;

    @NotNull(message = "El Apellido no puede estar Vacio")
    @Column(name = "apellidos")
    private String apellidos;

    @NotNull(message = "El Tipo de Documento no puede estar Vacio")
    @Column(name = "tipoDocumento")
    private String tipoDocumento;

    @NotNull(message = "El Numero de Documento no puede estar Vacio")
    @Column(name = "numeroDocumento")
    private String numeroDocumento;

}
