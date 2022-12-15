package com.jeansimon.retointerbank.model;


import lombok.Data;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;

@Entity
@Data
@Table(name = "bd_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
