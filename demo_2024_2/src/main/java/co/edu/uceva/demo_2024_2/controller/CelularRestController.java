package co.edu.uceva.demo_2024_2.controller;

import co.edu.uceva.demo_2024_2.modelo.entities.Celular;
import co.edu.uceva.demo_2024_2.modelo.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demo-2024-2")
public class CelularRestController {

    @Autowired
    private CelularServiceImpl celularService;

    @GetMapping("/celu")
    public List<Celular> listar() {
        return this.celularService.listar();
    }

    @GetMapping("/celu/{id}")
    public Celular buscarCelular(@PathVariable Long id) {
        return this.celularService.findById(id);
    }

    @PostMapping("/celu")
    public Celular guardarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @PutMapping("/celu")
    public Celular actualizarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @DeleteMapping("/celu/{id}")
    public void eliminarCelular(@PathVariable Long id) {
        Celular celular = this.celularService.findById(id);
        this.celularService.delete(celular);

    }
}
