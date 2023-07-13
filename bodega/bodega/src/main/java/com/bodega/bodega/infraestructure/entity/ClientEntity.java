package com.bodega.bodega.infraestructure.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bodega")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private LocalDateTime fechaTomaPedido;

    private String nombre;

    private String apellido;

    private  Integer nit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Seller_nit",referencedColumnName = "nit")
    private SellerEntity sellerEntity;


}
