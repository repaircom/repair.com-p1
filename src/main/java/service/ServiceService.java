package service;


import model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ServiceRepository;

import java.util.List;
import java.util.Optional;

@Service
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
        Service service = serviceRepository.findById(id).orElseThrow();
        service.setName(serviceDetails.getName());
        service.setDescription(serviceDetails.getDescription());
        return serviceRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

}
