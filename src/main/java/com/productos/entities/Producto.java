
package com.productos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "tb_producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pr_id", nullable = false)
    private Integer id;

    @Column(name = "pr_nombre", nullable = false)
    private String nombre;

    @Column(name = "pr_tipo", nullable = false)
    private String tipo;

    @Column(name = "pr_precio", nullable = false)
    private Double precio;

    @Column(name = "pr_cantidad", nullable = false)
    private Integer cantidad;
}

