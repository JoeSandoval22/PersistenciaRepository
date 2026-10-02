/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cr.ac.una.sistematurnos.persistencia;

import cr.ac.una.sistematurnos.modelo.Turno;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author User
 */
public interface TurnoRepository {
    void guardar(Turno turno);
    void actualizar(Turno turno);
    List<Turno> listar();
    Optional<Turno> buscarPorNumero(int numero);
}
