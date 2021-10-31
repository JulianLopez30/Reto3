/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria.domingo.web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import tutoria.domingo.modelo.Finca;
import tutoria.domingo.servicios.ServiciosFinca;

/**
 *
 * @author judal
 */
@RestController
@RequestMapping("/api/Farm")
public class WebFinca {
     @GetMapping("/holaMundo")
    public String saludad(){
    return "Hola Mundo Tutoria";
    }

    @Autowired
    private ServiciosFinca servicio;
    @GetMapping("all")
    public List <Finca> getFinca(){
        return servicio.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Finca> getFinca(@PathVariable("id") int idFinca) {
        return servicio.getFinca(idFinca);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Finca save(@RequestBody Finca finca) {
        return servicio.save(finca);
    }
    
     @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Finca update(@RequestBody Finca finca) {
        return servicio.update(finca);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int fincaId) {
        return servicio.deleteFinca(fincaId);
    }
}