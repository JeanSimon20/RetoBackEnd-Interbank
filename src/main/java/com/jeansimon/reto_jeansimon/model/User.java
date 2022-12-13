package com.jeansimon.reto_jeansimon.model;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "db_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoUnico;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "tipoDocumento")
    private String tipoDocumento;

    @Column(name = "numeroDocumento")
    private String numeroDocumento;

}
