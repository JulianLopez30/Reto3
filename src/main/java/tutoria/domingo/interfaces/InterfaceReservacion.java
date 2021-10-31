/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tutoria.domingo.interfaces;

import tutoria.domingo.modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author judal
 */
public interface InterfaceReservacion extends CrudRepository<Reservacion,Integer>{
    
}