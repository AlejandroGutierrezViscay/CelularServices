package co.edu.uceva.celularservicesaplication.controller;

import co.edu.uceva.celularservicesaplication.model.entities.Celular;
import co.edu.uceva.celularservicesaplication.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    /*Recibe periciones http y retorna sus respuestas*/
@RestController
@RequestMapping("/api/v1/celular-service")
public class CelularRestController {

    @Autowired
    private CelularServiceImpl celularService;

    /*retorna la lista de celulares*/
    @GetMapping("/celulares")
    public List<Celular> getAllCelulars() {return this.celularService.listarCelular(); }

    /*retorna celular por id y lo mapea por url*/
    @GetMapping("/celulares/{id}")
    public Celular buscarCelular(@PathVariable long id) {return this.celularService.findById(id);}

    /*guarda celular y retorna objeto tipo celular ya guardado con su id*/
    @PostMapping("/celular")
    public Celular guardarCelular(@RequestBody Celular celular) {return this.celularService.save(Celular);}

    /*actualizacelular y retorna objeto tipo celular actualizado*/
    @PostMapping("/celular")
    public Celular actualizarCelualr(@RequestBody Celular celular) {return this.celularService.save(celular);}

    /*elimina celular por id*/
    @DeleteMapping("/celular/{id}")
    public void eliminarCelular(@PathVariable long id) {

        Celular celular = this.celularService.findById(id);
        this.celularService.delete(celular);
    }
}
