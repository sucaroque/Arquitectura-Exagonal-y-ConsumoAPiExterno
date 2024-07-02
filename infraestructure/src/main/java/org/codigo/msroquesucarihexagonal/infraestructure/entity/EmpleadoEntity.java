package org.codigo.msroquesucarihexagonal.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "personas")
@Getter
@Setter
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long id;

    @Column(name = "nombres")
    private String nombre;

    @Column(name = "ape_pat")
    private String apePat;

    @Column(name = "ape_mat")
    private String apeMat;

    @Column(name = "edad")
    private int edad;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "tipo_doc")
    private String tipoDoc;

    @Column(name = "num_docu")
    private String numDoc;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "salario")
    private double salario;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo")
    private String correo;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "date_crea")
    private Timestamp dateCrea;

    @Column(name = "usua_crea")
    private String usuaCrea;

    @Column(name = "date_Update")
    private Timestamp dateUpdate;

    @Column(name = "usua_Update")
    private String usuaUpdate;

    @Column(name = "date_delet")
    private Timestamp dateDelet;

    @Column(name = "usua_delet")
    private String usuaDelet;
}
