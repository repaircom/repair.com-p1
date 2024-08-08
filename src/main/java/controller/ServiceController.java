package controller;

import jakarta.xml.ws.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ServiceService;

import java.util.List;

@RestController
@RequestMapping("/services")
public abstract class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<Service> getAllServices() {
        return ServiceService.getAllServices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Service> getServiceById(@PathVariable Long id) {
        return ServiceService.getServiceById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Service createService(@RequestBody Service service) {
        return ServiceService.createService(service);
    }

    @PutMapping("/{id}")
    public abstract ResponseEntity<Service> updateService(@PathVariable Long id);

    @PutMapping("/{id}")
          public ResponseEntity<Service> updateService(@PathVariable Long id, @RequestBody Service serviceDetails) {
        return ResponseEntity.ok(serviceService.updateService(id, serviceDetails));
        }

        @DeleteMapping("/{id}")
          public ResponseEntity<Void> deleteService(@PathVariable Long id) {
        ServiceService.deleteService(id);
        return ResponseEntity.noContent().build();
        }
        }
