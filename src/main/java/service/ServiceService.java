package service;
<<<<<<< HEAD


import model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ServiceRepository;

import model.Service; // Import the correct model class
import repository.ServiceRepository; // Import the correct repository interface
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;
import java.util.Optional;

// Correct annotation for a Spring service class
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public Optional<Service> getServiceById(Long id) {
        return serviceRepository.findById(id);
    }

    public Service createService(Service service) {
        return serviceRepository.save(service);
    }

    public Service updateService(Long id, Service serviceDetails) {
        Service service = serviceRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Service not found"));
        service.setName(serviceDetails.getName());
        service.setDescription(serviceDetails.getDescription());
        return serviceRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

}
