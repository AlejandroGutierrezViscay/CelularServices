package co.edu.uceva.celularservicesaplication.model.entities;

import jakarta.persistance.Entity;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GenerationType;
import jakarta.persistance.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.processing.Generated;

@Data
@Entity

public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String marca;
    private int memoria;
    private String puntos_venta;
}
