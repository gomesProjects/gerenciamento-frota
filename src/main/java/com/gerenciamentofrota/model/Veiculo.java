package com.gerenciamentofrota.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank
    @Size(max=4)
    private String ano;

    @NotBlank
    @Size(max=9)
    private String placa;

    @JoinColumn(name="marca_id")
    @ManyToOne
    private Marca marca;

    @JoinColumn(name="modelo_id")
    @ManyToOne
    private Modelo modelo;
}