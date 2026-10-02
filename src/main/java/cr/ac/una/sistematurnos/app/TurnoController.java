/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.sistematurnos.app;

import cr.ac.una.sistematurnos.servicio.TurnoService;

/**
 *
 * @author User
 */
public class TurnoController {
    private final TurnoService servicio;

    public TurnoController(TurnoService servicio) {
        this.servicio = servicio;
    }

    public String solicitarTurno() {
        return "Su turno es el " + String.format("%03d", servicio.crearTurno().getNumero());
    }
}
