package controller;

import model.Technician;
import service.TechnicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technicians")
public class TechnicianController {

    @Autowired
    private TechnicianService technicianService;

    @GetMapping
    public List<Technician> getAllTechnicians() {
        return technicianService.getAllTechnicians();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Technician> getTechnicianById(@PathVariable Long id) {
        return technicianService.getTechnicianById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Technician createTechnician(@RequestBody Technician technician) {
        return technicianService.createTechnician(technician);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Technician> updateTechnician(@PathVariable Long id, @RequestBody Technician technicianDetails) {
        return ResponseEntity.ok(technicianService.updateTechnician(id, technicianDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTechnician(@PathVariable Long id) {
        technicianService.deleteTechnician(id);
        return ResponseEntity.noContent().build();
    }
}
