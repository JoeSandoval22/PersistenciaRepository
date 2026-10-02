/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.sistematurnos.modelo;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Turno {
    private final int numero;
    private EstadoTurno estado;
    private final LocalDateTime fechaHora;

    public Turno(int numero, EstadoTurno estado, LocalDateTime fechaHora) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El número de turno debe ser positivo");
        }
        this.numero = numero;
        this.estado = Objects.requireNonNull(estado, "El estado es obligatorio");
        this.fechaHora = Objects.requireNonNull(fechaHora, "La fecha es obligatoria");
    }

    public int getNumero() { return numero; }
    public EstadoTurno getEstado() { return estado; }
    public LocalDateTime getFechaHora() { return fechaHora; }

    public void setEstado(EstadoTurno estado) {
        this.estado = Objects.requireNonNull(estado);
    }

    @Override
    public String toString() {
        return String.format("Turno %03d [%s] %s", numero, estado, fechaHora);
    }
}
